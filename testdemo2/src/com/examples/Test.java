package com.examples;

interface Test1{
	int show(int a,int b);
	
}

public class Test {
	
	
	  
	public static void main(String[] args) {
		
   	Test1 t=	(a,b)->(a+b);
   	Test1 mul=(a,b)-> a*b;
   	
   	      int add= t.show(10,20);
   	      System.out.println("Add of Two Number is "+add);
   	      System.out.println("Multiplication of Two Numbers is "+mul.show(2,3));
	}

}
