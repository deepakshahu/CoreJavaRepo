package com.nit.hk.sh.methods;

import java.util.Scanner;

public class Test02_StringHandling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s1 = sc.nextLine();
		
		if(s1.equals("hari")) {
			System.out.println("Hi "+s1.toUpperCase());
		}else {
			System.out.println("Are you "+s1.concat(" Krishna")+" ?");
		}
	}
}