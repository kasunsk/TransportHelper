package com.kasun.app.transport.carpool.dao;

/**
 * Created by kasunk on 5/3/16.
 */
public interface CarpoolDao<T> {

    T save(T carpool);
}
