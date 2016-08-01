package com.liuyao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Animinal {
	void run();
	void bark(String who);
}

class Dog implements Animinal{
	public void run (){
		System.out.println("happy run");
	}
	public void bark(String who) {
		System.out.println("happy bark to : "+who);
	}
}


class AniminalProxy implements InvocationHandler {

	private Animinal target;

	public AniminalProxy(Animinal target) {
		this.target = target;
	}

	public Object invoke(Object proxy,Method method,Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		//增强的代码
		System.out.println("我要做一项动作" + proxy.getClass());

		//目标对象的调用
		return method.invoke(target,args);
	}
}


public class proxy {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Animinal animinal = (Animinal)Proxy.newProxyInstance(
				Animinal.class.getClassLoader(), new Class[]{Animinal.class}, new AniminalProxy(dog));
		animinal.bark("liyang");
		animinal.run();
		System.out.println(animinal.getClass());
	}
}
