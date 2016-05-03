package com.kasun.common.hibernate.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kasunk on 5/3/16.
 */
public class AbstractHibernateDao {

    private HibernateDaoHelper hibernateDaoHelper;

    public Session getSession(){
        return hibernateDaoHelper.getSession();
    }

    @Autowired
    public void setHibernateDaoHelper(HibernateDaoHelper hibernateDaoHelper) {
        this.hibernateDaoHelper = hibernateDaoHelper;
    }
}
