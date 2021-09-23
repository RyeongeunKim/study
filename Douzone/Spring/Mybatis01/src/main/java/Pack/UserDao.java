package Pack;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

interface Delegate{
	int delegate(SqlSession session);
}
class Proxy{
	static void command(UserDao dao, Delegate d) {
		SqlSession session = dao.ssf.openSession();
		try {
			if(d.delegate(session) > 0)
				session.commit();
		} catch (Exception e) { e.printStackTrace();
		} finally { session.close(); }
	}
}

public class UserDao {
	SqlSessionFactory ssf;

	UserDao(){
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			ssf = new SqlSessionFactoryBuilder().build(is);
		} catch (Exception e) { e.printStackTrace();}		
	}

	void insert(final int num){
		Proxy.command(this, new Delegate() {
			public int delegate(SqlSession session) {
				return session.insert("test02",num);
			}
		});
	}
	
	void update(final int num){
		Proxy.command(this, new Delegate() {
			public int delegate(SqlSession session) {
				return session.update("test03",num);
			}
		});
	}
	
	void showAge() {
		SqlSession session = ssf.openSession();
		List<Integer> mm = session.selectList("test01");
		for (Integer item : mm) {
			System.out.print(item + " ");
		}System.out.println();		
		session.close();
	}
}
