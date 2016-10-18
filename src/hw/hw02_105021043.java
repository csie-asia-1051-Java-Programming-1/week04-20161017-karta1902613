package hw;
/*
 Topic: 使用者輸入正整數 n 與 m 然後計算C n取m
 * Date: 2016/10/17
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class hw02_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int sum  = 1;
		int msum = 1;
		for(int i=m+1;i<=n;i++){
	     	sum*=i;}
		for(int i=1;i<=n-m;i++){
			msum*=i;}
		System.out.println(sum/msum);}}
