package com.nit.hk.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyUsingScanner {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//Create Scanner class object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter source file path: ");
		String srcFile = sc.next();
		
		System.out.println("Enter destination file path: ");
		String destFile = sc.next();
		
		//Create object of FIS
		FileInputStream fis = new FileInputStream(srcFile);
		
		//Create object of fos
		FileOutputStream fos = new FileOutputStream(destFile);
		
		//Read the data from file
		int data;
		while((data = fis.read()) != -1) {
			fos.write(data);
		}
		System.out.println("File copied");
		fis.close();
		fos.close();
	}
}