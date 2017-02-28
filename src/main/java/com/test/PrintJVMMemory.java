package com.test;

public class PrintJVMMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Runtime.getRuntime().maxMemory());  //最大可用内存，对应-Xmx

		System.out.println(Runtime.getRuntime().freeMemory());;  //当前JVM空闲内存

		System.out.println(Runtime.getRuntime().totalMemory());;  //当前JVM占用的内存总数，其值相当于当前JVM已使用的内存及freeMemory()的总和
		
		System.out.println(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory());
	}

}
