package com.hand.exam4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortMapValues {

	public static void sort(Integer[] arr){
		for(int i = 0; i < arr.length - 1; i++ ){
			for( int j = i + 1; j < arr.length; j++ ){
				if( arr[i] > arr[j] ){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		System.out.print("随机生成50个小于100的整数，分别为：");
		List<Integer> list = new ArrayList<Integer>(50);
		int temp;
		for( int i = 0; i < 49; i++ ){
			temp = (int) (Math.random()*100);
			list.add( temp );
			System.out.print(temp + ",");
		}
		temp = (int) (Math.random()*100);
		System.out.println(temp);
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		for(Integer i : list ){
			List<Integer> values;
			if( ( values = map.get(i/10) ) != null ){
				values.add(i);
			}
			else{
				values = new ArrayList<Integer>();
				values.add(i);
				map.put(i/10, values);
			}
		}
		Set<Integer> set = map.keySet();
		System.out.print("Map中的数据为：{");
		for( Integer i: set ){
			System.out.print(i + "=>[");
			List<Integer> tempList = map.get(i);
			Object[] arr = tempList.toArray();
			Integer[] arrInt = new Integer[arr.length];
			for( int j = 0; j < arr.length-1; j++ ){
				arrInt[j] = (Integer) arr[j];
				System.out.print(arr[j] + ",");
			}
			System.out.print(arr[arr.length-1] + "],");
			arrInt[arr.length-1] = (Integer) arr[arr.length-1];
			sort(arrInt);
			tempList.clear();
			tempList.addAll(Arrays.asList(arrInt));
		}
		System.out.println();
		System.out.print("排序后的Map为：{");
		for( Integer i: set ){
			System.out.print(i + "=>[");
			List<Integer> tempList = map.get(i);
			Object[] arr = tempList.toArray();
			Integer[] arrInt = new Integer[arr.length];
			for( int j = 0; j < arr.length-1; j++ ){
				System.out.print(arr[j] + ",");
			}
			System.out.print(arr[arr.length-1] + "],");
		}
		System.out.println();
	}

}
