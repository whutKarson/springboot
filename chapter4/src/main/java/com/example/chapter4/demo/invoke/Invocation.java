package com.example.chapter4.demo.invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Invocation {

    private Object[] parms;
    private Method method;
    private Object target;

    public Invocation(Object target, Method method, Object[] parms) {
        this.parms = parms;
        this.method = method;
        this.target = target;
    }

    //Reflect method
    public Object proceed() throws InvocationTargetException, IllegalAccessException

    {
        return method.invoke(target, parms);
    }

    public Object[] getParms() {
        return parms;
    }

    public void setParms(Object[] parms) {
        this.parms = parms;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}
