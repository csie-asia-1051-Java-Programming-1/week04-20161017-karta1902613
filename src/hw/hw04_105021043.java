package hw;
/*
 * Topic: 讓使用者輸入1, 2, 3, 與4選項，
 *1.輸入 n 並顯示圖形 (ex: n = 5)
 *2.輸入 n 並顯示圖形
 *3.輸入 n (必須是奇數)並顯示圖形
 *4.結束程式
 * Date: 2016/10/17
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class hw04_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int c = scn.nextInt();
		if(c==1){
			int n = scn.nextInt();
			    for(int i=n-2;i>0;i--){
				for(int j=i;j>0;j--){
					System.out.print("@");}
				    System.out.println("");}
			    for(int i=2;i<n-1;i++){
					for(int j=0;j<i;j++){
				    System.out.print("@");}
					System.out.println("");}}
		else if(c==2){
			int n = scn.nextInt();
			    for(int i=2;i<n-1;i++){
			    for(int j=1;j<i;j++){
				    System.out.print("@");}
				    System.out.println("");}
			    for(int i=n-2;i>0;i--){
			    for(int j=i;j>0;j--){
					System.out.print("@");}
				    System.out.println("");}}
		else if(c==3){
			int g = scn.nextInt();
			int n = (g-2)+3;
			int m = g/2+2;
			if(n%2!=1){				
				 for (int i=1;i<=n/2;i++){
				      for (int j=n/2;j>i;j--) {
				        System.out.print(" ");}
				      for (int l=1;l<i*2;l++){
				        System.out.print("*");}
				        System.out.println();}
				for (int i=n/2;i>1;i--) {
				    for (int j=n/2+1;j>i;j--) {
				        System.out.print(" ");}
				    for(int l=1;l<(i-1)*2;l++) {
				        System.out.print("*");}
				      System.out.println();}}
			    else{
			System.out.print("結束程式");}}}}


