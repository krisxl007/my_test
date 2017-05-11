package hibernate;

import hibernate.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;



public class TeacherTest {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setName("Linda");
		t.setTitle("Math teacher");
		
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();

		session.beginTransaction(); 
		
		session.save(t);
		
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
