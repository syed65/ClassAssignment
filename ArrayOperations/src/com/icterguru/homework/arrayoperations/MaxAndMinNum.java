package com.icterguru.homework.arrayoperations;

public class MaxAndMinNum {


	public static void main(String[] args) {
		int num[]; 
		num= new int [5];

		num[0]= 70;
		num[1]= 80;
		num[2]= 100;
		num[3]= 110;
		num[4]= 120;


		int maxNum= num[4];
		int minNum = num [0];


		System.out.println("The Max Number is= " +maxNum);
		System.out.println("The Min Number is= " +minNum);

	}
}


