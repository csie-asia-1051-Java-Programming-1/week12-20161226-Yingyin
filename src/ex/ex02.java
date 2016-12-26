package ex;

import java.util.Scanner;

/*
 * Topic: 給定一字串，請將此字串中，每個字元的 ASCII 編碼數值進行加總，輸出其編碼數 值總和。舉例來說，若輸入之字串為 “abcdefghij” 共 10 個字元，其 ASCII 編碼依序為 “97 98 99 100 101 102 103 104 105 106” ，則編碼總和輸出為 1015 。
 * Date: 2016/12/26
 * Author: 1050210XX 周永振老師
 */

public class ex02 {

	public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	String str =sca.nextLine();
	char v2=str.charAt(0);
	int v1=(int)v2;
	int sum=0;
	for(int i=0;i<str.length();i++){
		sum+=(int) str.charAt(i);
		
	}
		
	System.out.println(sum);
	}

}
