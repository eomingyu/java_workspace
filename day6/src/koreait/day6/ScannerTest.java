package koreait.day6;

import java.util.Scanner;

public class ScannerTest {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		
		int a= sc.nextInt();
		System.out.println(a);
		
		testA();
		
	}

	static void testA() {
		int c = sc.nextInt();
		System.out.println(c);
	}
	
	@Override
	protected void finalize() throws Throwable {
		sc.close();
	}
	
}
