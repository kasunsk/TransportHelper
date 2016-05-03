package com.kasun.app.transport.carpool.dao;

import com.kasun.app.transport.carpool.model.CarpoolEntity;
import com.kasun.common.hibernate.dao.AbstractHibernateDao;

/**
 * Created by kasunk on 5/3/16.
 */
public class CarpoolHibernateDao extends AbstractHibernateDao implements CarpoolDao<CarpoolEntity> {


    @Override
    public CarpoolEntity save(CarpoolEntity carpool) {

        getSession().save(carpool);
        return carpool;
    }

}
