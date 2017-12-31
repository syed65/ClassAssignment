package com.icterguru.java.homeworklutfor;

public class DataInfoProg {

	public static void main(String[] args) {
		String A;
		A = "Primitive";
		System.out.println("Followin are " + A + "  datatypes with their default size & values :");
		String[] obj = new String[11];
		obj[0] = "byte=    1 byte  "  + "value=0";
		obj[1] = "short=   2 bytes " +"value=0";
		obj[2] = "int =    4 bytes " + "value=0";
		obj[3] = "long=    8 bytes " + "value=0L";
		obj[4] = "float=   2 bytes " + "value=0.0f";
		obj[5] = "double=  8 bytes " +"value=0.0d";
		obj[6] = "boolean= 1 byte  "  +"value=false";
		obj[7] = "char=    2 bytes "+"value="+"\\u0000";
		System.out.println(obj[0] + "\n" + obj[1] + "\n" + obj[2] + "\n" + obj[3]);
		System.out.println(obj[4] + "\n" + obj[5] + "\n" + obj[6] + "\n" + obj[7]);

		String B;
		B = "NonPrimitive";

		System.out.println("\nFollowin are " + B + "  datatypes  :");
		obj[8] = "String";
		obj[9] = "Array";
		obj[10] = "Others";
		System.out.println(obj[8] + "\n" + obj[9] + "\n" + obj[10]);
		
		
			
		

	}
}

