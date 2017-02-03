package br.com.sh.util;

import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			StandardServiceRegistryBuilder registrador = new StandardServiceRegistryBuilder();
			registrador.applySettings(cfg.getProperties());
			StandardServiceRegistry servico = registrador.build();
			return cfg.buildSessionFactory(servico);
		} catch (Throwable e) {
			System.out.println("Criação inicial do objeto SessionFactory deu falha: " + e);
			throw new ExceptionInInitializerError(e);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
