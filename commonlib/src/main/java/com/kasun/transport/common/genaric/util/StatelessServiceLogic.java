package com.kasun.transport.common.genaric.util;

/**
 * Created by kasunk on 5/3/16.
 */
public abstract class StatelessServiceLogic<T, V> implements ServiceLogic<T, V> {
    public StatelessServiceLogic() {
    }

    public abstract T invoke(V var1);
}
