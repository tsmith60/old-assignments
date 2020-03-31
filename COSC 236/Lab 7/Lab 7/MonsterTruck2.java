//Ted Smith III   Cosc 236 Section 003
//  Lab 7 Problem 3

public class MonsterTruck2 extends Truck {

	
	
	public void m1(){
		System.out.println("monster 2");
	}
	
	public void m2(){
		super.m2();
		System.out.println("truck 2");
		System.out.println("car 2");
	}
	public String toString(){
		return "monster 2 vroomvroom";
	}
}
