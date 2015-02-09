package com.inheritance.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.net.URL;

public class HibernateConfiguration {
    private static HibernateConfiguration uniqueInstance = new HibernateConfiguration();
    private Configuration configuration;
    private SessionFactory sf;

    public SessionFactory getSessionFactory() {
        buildSessionFactory();
        return sf;
    }

    public static HibernateConfiguration getInstance() {
        return uniqueInstance;
    }

    private HibernateConfiguration() {

    }

    private HibernateConfiguration prepareConfiguration() {
        if (this.configuration == null) {
            this.configuration = new Configuration();
        }

        URL configFile = getClass().getClassLoader().getResource("hibernate/cfg/hibernate.cfg.xml");
        this.configuration = new Configuration();
        this.configuration.configure(configFile);

        loadCfgFromResource("hibernate/cfg/product.cfg.xml");
        loadCfgFromResource("hibernate/cfg/lz-product.cfg.xml");
        loadCfgFromResource("hibernate/cfg/cz-product.cfg.xml");
        return this;
    }

    private void loadCfgFromResource(String moduleCfgResourceName) {
        try {
            URL mappingFile = getClass().getClassLoader().getResource(moduleCfgResourceName);
            this.configuration = this.configuration.configure(mappingFile);
        } catch (Throwable t) {
            throw t;
        }
    }

    private SessionFactory buildSessionFactory() {
        if (sf != null) {
            return sf;
        }

        prepareConfiguration();
        this.sf = this.configuration.buildSessionFactory();
        return this.sf;
    }

}
