package com.kasun.transport.common.genaric.util;

/**
 * Created by kasunk on 5/3/16.
 */
public interface ServiceLogic<T, V> {
    T invoke(V var1);
}
