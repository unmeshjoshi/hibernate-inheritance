package com.inheritance.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hsqldb.cmdline.SqlFile;

import java.io.File;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

public class HibernateRepository<T, K extends Serializable> {

    public void execute(File f) throws Exception {
        SqlFile file = new SqlFile(f);
        Connection c = DriverManager.getConnection("jdbc:hsqldb:mem:testdb", "sa", "");
        file.setConnection(c);
        file.execute();
        c.commit();
    }

    public void save(T t) {
        Session session = getSession();
        session.save(t);
        session.flush();
        session.close();
    }

    private Session getSession() {
        HibernateConfiguration hibernateConfiguration = HibernateConfiguration.getInstance();
        SessionFactory sessionFactory = hibernateConfiguration.getSessionFactory();
        return sessionFactory.openSession();
    }

    public T load(Class<T> clazz, K key) {
        Session session = getSession();
        T t = (T) session.load(clazz, key);
        session.close();
        return t;

    }
}
