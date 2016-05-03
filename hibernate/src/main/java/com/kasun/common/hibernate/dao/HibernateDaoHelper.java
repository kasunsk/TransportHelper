package com.kasun.common.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by kasunk on 5/3/16.
 */
public class HibernateDaoHelper {

    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
