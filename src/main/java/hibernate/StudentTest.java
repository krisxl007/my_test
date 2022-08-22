package hibernate;


import hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("s9");
		s.setAge(9);
		
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction(); 
		
		session.save(s);
		
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
