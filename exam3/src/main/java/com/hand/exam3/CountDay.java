package com.hand.exam3;

import java.util.Scanner;

public class CountDay {
	
	public static boolean isLeapYear(int year){
		if( year % 400 == 0 || year % 4 == 0 && year % 100 != 0 )
			return true;
		return false;
	}
	
	public static int countDay(String date) throws Exception{
			int sum = 0;
			String[] info = date.split("-");
			int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
			sum += Integer.parseInt(info[2]);
			for( int i = 0; i < Integer.parseInt(info[1]) - 1; i++ )
				sum += months[i];
			sum += isLeapYear(Integer.parseInt(info[0])) ? 1 : 0;
			return sum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入日期：");
		String date = scan.nextLine();
		int res = 0;
		try {
			res = countDay(date);
			System.out.println("你输入的日期为当年的第" + res +"天");
		} catch(Exception e){
			System.out.println("请输入正确的日期格式！YYYY-MM-DD");	
		}
		
	}

}
