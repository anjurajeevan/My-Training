package com.maven.nonstaticExcelread;

import java.io.IOException;

public class ExcelMain {
	
	public static void main(String[] args) throws IOException {
		ExcelRead e= new ExcelRead();
		String s =e.readStringData(2, 1);
		System.out.println("va;ue of s " +s);
		String s2=e.readIntegerData(2, 0);
		System.out.println("value of s2 "+s2);
	}

}
