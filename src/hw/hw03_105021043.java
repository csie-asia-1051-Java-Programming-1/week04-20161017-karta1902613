package hw;

import java.util.Scanner;

/*
 * Topic:�o�ӵ{�����ϥΪ̳s���J��� (���ơB�t�Ƥιs)�A����ϥΪ̿�J 999 �ɰ���A�M����ܥ��Ʀ��h�֭ӡA0 ���X�ӡA�t���`�@���X�ӡA�ϥΪ̥i�H���а��檽��ϥΪ̿�Jn
 * Date: 2016/10/17
 * Author: 105021043 �B�ͤ�
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
		System.out.println(x+"�ӥ���");
		System.out.println(y+"�ӭt��");
		System.out.println(z+"�ӹs");}}
