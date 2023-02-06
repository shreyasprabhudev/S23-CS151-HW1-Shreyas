package edu.sjsu.cs;

class Temp {
	static int val;
	
	public Temp(int i) {
		this.val = i;
	}
	public int returnVal() {
		return val;
	}
}

public class Test {
	public static void main(String[] args) {
		Temp a = new Temp(1);
		System.out.println(a.returnVal());
		Temp b = new Temp(2);
		System.out.println(a.returnVal());
		System.out.println(b.returnVal());
	
	}
}
