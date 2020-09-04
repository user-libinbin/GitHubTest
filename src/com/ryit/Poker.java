package com.ryit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Poker {

	 public static void main(String[] args) {
		/***/
		 
		ArrayList<String> array = new ArrayList<String>();
		String[] str = {"黑桃","红桃","方块","梅花"};
		for(int i=0; i<4; i++) {//
			for(int j=1; j<=13;j++) {// A--k
				if(j==1) {
					array.add("A"+str[i]);
				}else if(j == 11) {
					array.add("J"+str[i]);
				}else if(j == 12) {
					array.add("Q"+str[i]);
				}else if(j == 13) {
					array.add("K"+str[i]);
				}else {
					array.add(j+str[i]);
				}
			}
		}
		array.add("小王");
		array.add("大王");
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=0; i<array.size();) {
			int a = (int)(Math.random()*array.size());//
			arr.add(array.remove(a));
		}
		ArrayList<ArrayList<String>> brr = new ArrayList<ArrayList<String>>();// 
		int s = new Random().nextInt(3);// 
		for(int i=0; i<3; i++) {// 
			ArrayList<String> foot1 = new ArrayList<String>();
			brr.add(sop(arr,foot1));//
		}
		System.out.println("地主牌"+arr);// 
		for(int i=0; i<brr.size(); i++) {
			if(s == i) {// 
				for(int j=0; j<arr.size(); j++) {// 
					brr.get(i).add(arr.get(j));
				}
			}
			Collections.sort(brr.get(i));
		}
		for(int i=0; i<brr.size(); i++) {
			System.out.println("玩家"+(i+1)+brr.get(i)+"------"+brr.get(i).size());
		}
		
		
	}
	public static ArrayList<String> sop(ArrayList<String> arr,ArrayList<String> foot1) {
		for(int i=0; i<17; i++) {//
			foot1.add(arr.remove(0));
		}
		return foot1;
	}
	
}