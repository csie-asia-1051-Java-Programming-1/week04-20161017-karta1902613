﻿package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class ex02_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
        while(true){
        int a = scn.nextInt();
		int b = scn.nextInt();
        System.out.println(a+"x"+b+"="+a*b);
        System.out.println("是否繼續(Y/n)");
        char check = scn.next().charAt(0);
        if(check=='Y'||check=='y'){
        	continue;}
        else{
        	break;}}}}