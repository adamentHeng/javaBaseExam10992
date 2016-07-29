package com.hand.exam2;

import java.util.Scanner;

public class Cacl {
	
	public static float cacl(float salary, float point){
		float result = 0;
		float[] levels = new float[6];
		levels[0] = (float) (1500 * 0.03);
		levels[1] = (float) (3000 * 0.1);
		levels[2] = (float) (4500 * 0.2);
		levels[3] = (float) ((35000-9000) * 0.25);
		levels[4] = (float) (20000 * 0.3);
		levels[5] = (float) (25000 * 0.35);
		for( int i = 1; i < levels.length; i++ )
			levels[i] += levels[i-1];
		if( salary <= point )
			return 0;
		else if( salary  <= point + 1500 ){
			 result += (salary - point) * 0.03;
		}
		else if( salary <= point + 4500 ){
			result += levels[0];
			result += (salary - point) * 0.1;
		}
		else if( salary <= point + 9000 ){
			result += levels[1];
			result += (salary - point) * 0.2;	
		}
		else if( salary <= point + 35000 ){
			result += levels[2];
			result += (salary - point) * 0.25;
		}
		else if( salary <= point + 55000 ){
			result += levels[3];
			result += (salary - point) * 0.3;
		}
		else if( salary <= point + 80000 ){
			result += levels[4];
			result += (salary - point) * 0.35;
		}
		else {
			result += levels[5];
			result += (salary - point) * 0.45;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输出工资：");
		float salary = scan.nextFloat();
		System.out.println("所需缴纳的税费为：" + cacl(salary,3500));
	}

}
