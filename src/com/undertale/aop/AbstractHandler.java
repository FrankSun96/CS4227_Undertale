package com.undertale.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public abstract class AbstractHandler implements InvocationHandler{
	private Object targetObject;

	public void setTargetObject(Object targetObject) {
		this.targetObject = targetObject;
	}

	public Object getTargetObject() {
		return targetObject;
	}

}
