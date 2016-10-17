package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class ex04_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		int sum=0;
		for(int i=n;i>0;i--){
			System.out.println("");
			sum+=i;
			for(int j=i;j>0;j--){
				System.out.print("@");}}}}
