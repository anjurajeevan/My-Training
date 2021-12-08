package com.maven.excelread;

import java.io.IOException;

public class ExcelMain {
	public static void main(String[] args) throws IOException {
		String s= ExcelRead.readStringData(1,1);
		System.out.println("Value of s is " +s);
		String s2=ExcelRead.readIntegerData(1,0);
		System.out.println("Value of s2 is " +s2);
	}

}
