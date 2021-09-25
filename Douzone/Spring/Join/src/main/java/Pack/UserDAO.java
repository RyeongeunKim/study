package Pack;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserDAO {
	SqlSessionFactory ssf;
	UserDAO(){
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			ssf = new SqlSessionFactoryBuilder().build(is);
		} catch (Exception e) { e.printStackTrace();}		
	}
	
	int login(UserDTO udto){
		
		SqlSession session = ssf.openSession();
		int check = -1;
		List<String> pw = session.selectList("test01", udto);
		if(pw.size() == 1) {
			check = 1;
		} else {
			check = 0;
		}	
		session.close();
		return check;
	}	
	
	void insert(UserDTO udto){
		
		SqlSession session = ssf.openSession();
		try {
			int result = session.insert("test03", udto);
			if(result > 0) session.commit(); 
			} catch (Exception e) { e.printStackTrace();
			} finally { session.close(); }
	}
	
	int idCheck(String id) {
		
		SqlSession session = ssf.openSession();
		int check = 0;
		List<String> mm = session.selectList("test02", id);
		System.out.println(mm.size());
		if(mm.size() > 0) {
			check = 1; // 아이디 있음 사용X
		} else {
			check = 0; // 아이디 없음 사용O
		}
		session.close();
		return check;
	}

}
