package com.annotationuse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embedded_Example {

	public static void main(String[] args) {

		try {
			Configuration cfg = new Configuration();

			cfg.configure("config.xml");

			SessionFactory factory = cfg.buildSessionFactory();

			Company company = new Company();
			company.setC_name("Google");
			company.setId(1);
			company.setIncome(10);
		company.setRanks1(3);

			CompanyInfo ci = new CompanyInfo();
			ci.setAdds("jbjhbjb");
			ci.setCInfo("abc");
			ci.setCity("pune");

			company.setInfo(ci);

			Session session = factory.openSession();

			Transaction tran = session.beginTransaction();

			session.save(company);

			tran.commit();
			session.close();
			factory.close();

		} catch (Exception e) {
             System.out.println(e);
		}
	}

}
