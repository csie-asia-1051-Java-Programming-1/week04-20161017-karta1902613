package hw;

import java.util.Scanner;

/*
 * Topic:這個程式讓使用者連續輸入整數 (正數、負數及零)，直到使用者輸入 999 時停止，然後顯示正數有多少個，0 有幾個，負數總共有幾個，使用者可以重覆執行直到使用者輸入n
 * Date: 2016/10/17
 * Author: 105021043 劉凱文
 */
public class hw03_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n =0;
		int x =-1;
		int y =0;
		int z =0;
		while(n!=999){
			 n = scn.nextInt();
			if (n>0){
				x++;}		
			else if(n<0){
				y++;}
			else if(n==0){
				z++;}}
		System.out.println(x+"個正數");
		System.out.println(y+"個負數");
		System.out.println(z+"個零");}}
