package Pack;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//Bean
// 1. 디폴트 생성자만 있다.
// 2. 반드시 setter, getter함수가 있어야 한다.
class Person{
	String name; // 필드(property)
	int age;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }	
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}

public class Hello {
	
	public static void main(String[] args) {
		System.out.println(1);
		SqlSessionFactory ssf = null;
		SqlSession session = null;
		InputStream is = null;
		
		try {
			is = Resources.getResourceAsStream("mybatis-config.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ssf = new SqlSessionFactoryBuilder().build(is);
		System.out.println(2);
		
		session = ssf.openSession();

		try {
			List<Person> mm = session.selectList("test08");
			for (Person p : mm) {
				System.out.println(p.getName() + " " + p.getAge());
			}
		} catch (Exception e) { e.printStackTrace();
		} finally { session.close(); }
		
		System.out.println(3);		
	}
}
/*
public class Hello {
	
	public static void main(String[] args) {
		UserDao udao = new UserDao();
		udao.insert(100);
		udao.showAge();
		udao.update(99);

	}
}
*/
/*
public class Hello {

	public static void main(String[] args) {
		System.out.println(1);
		SqlSessionFactory ssf = null;
		SqlSession session = null;
		
		InputStream is = null;
		
		try {
			is = Resources.getResourceAsStream("mybatis-config.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ssf = new SqlSessionFactoryBuilder().build(is);
		System.out.println(2);
		
		session = ssf.openSession();

		try {
			// int result = session.insert("test02", 9999);
			// int result = session.delete("test03", 9999);
			// int result = session.update("test04", 20);
			//if(result > 0) session.commit(); // select만 커밋 X
			List<Integer> mm = session.selectList("test01");
			for (Integer item : mm) {
				System.out.print(item + " ");
			}System.out.println();
			
			
		} catch (Exception e) { e.printStackTrace();
		} finally { session.close(); }
		
		System.out.println(3);

	}

}
*/