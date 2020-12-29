package test;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import curd.Hibernate.Student;

public class saveClient {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Student st=new Student();
		st.setId(111);
		st.setName("prashant");
		st.setEmail("abc@gmail.com");
		st.setAddress("pune");
		
		int pk=(Integer)session.save(st);
		System.out.println(pk);
		t.commit();
		session.close();
		sf.close();
		System.out.println("data inserted successfully");
		
		
		
		
		
		
		
		
		
	}

}
