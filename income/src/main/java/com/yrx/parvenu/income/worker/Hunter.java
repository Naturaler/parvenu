package com.yrx.parvenu.income.worker;

/**
 * Created by r.x on 2020/2/19.
 */
public abstract class Hunter<V> {

    public void doWork() {
        V result = hunt();
        storage(result);
    }

    protected abstract V hunt();

    protected abstract void storage(V t);
}
