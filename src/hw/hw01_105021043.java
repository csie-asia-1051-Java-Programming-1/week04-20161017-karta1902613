package hw;
/*
 * Topic: 使用者輸入 n 產生 n 個 費氏數列 (例 n = 5 )1, 1, 2, 3, 5
 * Date: 2016/10/17
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class hw01_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		int v1 = 1;
		int v2 = 2;
		int v3 = 0;
 		     if(n==1){
			System.out.print(1);}
 		else if(n==2){
			System.out.print(1+", "+1);}
		else if(n==3){
			System.out.print(1+", "+1+", "+2);}
		else if(n>=4){
			System.out.print(1+", "+1+", "+2+", "+3+", ");}
	
		for(int i=1;i<=n-4;i++){
			v3=v1+v2;
			v1=v2;
			v2=v3;
			v3=v1+v2;
			System.out.print(v3+", ");}}}
