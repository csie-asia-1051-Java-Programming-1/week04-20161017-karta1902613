package hw;
/*
 Topic: �ϥΪ̿�J����� n �P m �M��p��C n��m
 * Date: 2016/10/17
 * Author: 105021043 �B�ͤ�
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
