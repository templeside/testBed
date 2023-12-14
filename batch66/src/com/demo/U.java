package com.demo;

public class U {
	U(){
		this(10);
		System.out.println("U");
	}
	U(int i){
		this();
		System.out.println("U(int)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		U u1= new U();
		System.out.println("success");
	}

}
