package com.nit.hk.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemoDynamic {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream fis = new FileInputStream("E:\\Deepak\\Classcontent\\bbc.txt");
		int data;
		while((data = fis.read()) != -1) {
			System.out.println("data: "+data+"\t"+(char)data);
		}
		fis.close();
	}
}