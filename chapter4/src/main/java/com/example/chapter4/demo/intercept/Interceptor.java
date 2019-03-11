package com.example.chapter4.demo.intercept;

import com.example.chapter4.demo.invoke.Invocation;

import java.lang.reflect.InvocationTargetException;

public interface Interceptor {

    public boolean before();

    public void after();

    /**
     *
     * @param invocation 回调参数，可以通过它的proceed方法，回调原有事件
     * @return 原有事件的返回对象
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public Object around(Invocation invocation)
            throws InvocationTargetException, IllegalAccessException;

    public boolean useAround();

    public void afterReturning();

    public void afterThrowing();

}
