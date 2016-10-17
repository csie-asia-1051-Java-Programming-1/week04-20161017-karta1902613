package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class ex03_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		int sum=0;
		for(int i=0;i<n+1;i++){
			System.out.println("");
			sum+=i;
			for(int j=0;j<i;j++){
				System.out.print("*");}}}}
