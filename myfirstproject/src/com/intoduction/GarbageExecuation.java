package com.intoduction;

public class GarbageExecuation {
//	GarbageExecuation ref;
	class A{
		B b;
	}
	class B{
		A a;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("method started");
	}
	static void m1() {
		GarbageExecuation t=new GarbageExecuation();
	}
	public static void main(String[] args) {
//		nullifying objects
		GarbageExecuation t1=new GarbageExecuation();
		GarbageExecuation t2=new GarbageExecuation();
		t1=null;
		t2=null;
//		reassigning reference
		GarbageExecuation t3=new GarbageExecuation();
		t2=new GarbageExecuation();
//		out of scope
		m1();
//		anonymous object
		new GarbageExecuation();
//		island of isolation
		GarbageExecuation t4 = new GarbageExecuation();
		A a1 = t4.new A();
		B b1 = t4.new B();
		a1.b = b1;
		b1.a = a1;
		a1 = null;
		b1 = null;
		
		System.gc();

	}

}
