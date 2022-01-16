package com.nit.hk.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDynamic {

	public static void main(String[] args) throws IOException {
		
		//Create object of FIS
		FileInputStream fis = new FileInputStream(args[0]);
		
		//Create object of fos
		FileOutputStream fos = new FileOutputStream(args[1]);
		
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