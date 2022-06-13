package com.kh.git;

public class HelloGit {
	public static void main(String[] args) {
		System.out.println("HelloGit!!!");
		HelloGit hg1 = new HelloGit();
		hg1.dummy();
		hg1.addTwo(1, 3);
		hg1.addTwo(3, -5);
	}
	
	public void dummy() {
		System.out.println("더어어어어어어어어어어어어어어어미");
	}
	
	public int addTwo(int a, int b) {
		return a + b;
	}
}
