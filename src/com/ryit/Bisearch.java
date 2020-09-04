package com.ryit;

import java.util.Scanner;

public class Bisearch {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String... args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(myBisearch(arr));
	}
	
	public static int myBisearch(int[] arr){
		int min = 0;
		int max = arr.length-1;
		int mid = max/2;
		System.out.println("输入要查找的数值");
		int value = sc.nextInt();
		while(arr[mid] != value && max>min){
			if(arr[mid] > value) {
				max = mid-1;
				mid =(max+min)/2;
			}else if(arr[mid] < value) {
				min = mid +1;
				mid = (max+min)/2;
			}
		}
		if((value >arr[max]) || (value< arr[min])) {
			return -1;
		}
		return mid;
	}
	
	/**13、杨辉三角形*/
	public static void arr26() {
		int a = sc.nextInt();
		int[][] arr = new int[a][];
		for(int i=0; i<a;i++) {
			arr[i] =new int[i+1];
			arr[i][0] = 1;
			arr[i][arr[i].length-1]=1;
			if(i>1) {
				for(int j=1; j<arr[i].length-1; j++) {
					arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
				}
			}
			for(int m=0; m<arr[i].length; m++) {
				System.out.print(arr[i][m]+" ");
			}
			System.out.println("");
		}
	}
}
