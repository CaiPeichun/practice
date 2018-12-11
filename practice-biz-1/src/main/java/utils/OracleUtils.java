package utils;
//��ȡhibernate�Ĺ�����

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OracleUtils {
	public static Configuration configuration;
	public static SessionFactory sessionFactory;
	public static Session session;
	
	static {
		configuration =  new Configuration().configure("hibernate/hibernate.cfg.xml");
		
		sessionFactory = configuration.buildSessionFactory();
	}
	//��ȡһ��session
	public static Session getSession() {
		session = sessionFactory.openSession();
		return session;
	}
	
	public void close() {
		session.close();
		sessionFactory.close();
	}
}
