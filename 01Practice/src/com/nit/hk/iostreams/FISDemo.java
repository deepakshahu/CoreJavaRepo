package com.nit.hk.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream fis = new FileInputStream("E:\\Deepak\\Classcontent\\abc.txt");
		int data1 = fis.read();
		int data2 = fis.read();
		int data3 = fis.read();
		int data4 = fis.read();
		System.out.println("Data1: "+data1+" "+(char)data1);
		System.out.println("Data2: "+data2+" "+(char)data2);
		System.out.println("Data3: "+data3+" "+(char)data3);
		System.out.println("Data4: "+data4+" "+(char)data4);
		fis.close();
	}
}