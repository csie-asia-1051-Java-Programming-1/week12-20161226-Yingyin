package ex;

import java.util.Scanner;

/*
 * Topic: 輸入一整數 N 及 N 個整數，請依照十進位中各位數字和由小到大排序輸出。如果各位數字和相等則比較數值由小到大排列。
 例如: 9122 的各位數字和為 9+1+2+2=14、3128 的各位數字和為 3+1+2+8=14 而 5112 的各位數字和為 5+1+1+2=9。
 所以輸入 9122 3128 5112 需輸出 5112 3128 9122 ，這是因為 5112(9) < 3128(14) < 9122(14)，其中又因為 3128 與 9122 兩者的各位數字和都是 14，所以將 數值小的 3128 放前面。則經由計算可得其識別碼為 165 ，乃是 11 之倍數，故此為一合法之 ISBN 碼。輸入一串 ISBN 碼，以空格隔開。
 * Date: 2016/12/26
 * Author: 1050210XX 周永振老師
 */

public class ex01 {

	public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	int a=sca.nextInt();
	int data[]=new int[a];
	int data1[]=new int[a];
	for(int i=0;i<a;i++){
		data[i]=sca.nextInt();
		data1[i]=fun1(data[i]);
	}
    for(int i=0;i<a-1;i++){
    	for(int j=0;j<a-1;j++){
    		if(data1[j]>data1[j+1]){
    			int x=data[j];
    			data[j]=data[j+1];
    			data[j+1]=x;
    			int y=data1[j];
    			data1[j]=data1[j+1];
    			data1[j+1]=y;
    		}
    		else if(data1[j]==data1[j+1]){
    			if(data[j]>data[j+1]){
    				int x=data[j];
    				data[j]=data[j+1];
    				data[j+1]=x;
    				int y=data1[j];
    				data1[j]=data1[j+1];
    				data1[j+1]=y;
    			}
    		}
    	}
    }
	
    for(int i=0;i<a;i++){
    	System.out.print(data[i]+" ");
    }
    }
	private static int fun1(int x) {
	String a=Integer.toString(x);
	int sum=0;
	for(int i=0;i<a.length();i++ ){
		sum+=x%10;
		x/=10;
	}
		return sum;
	}

}
