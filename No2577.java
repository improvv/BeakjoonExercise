import java.util.Arrays;
import java.util.Scanner;

public class No2577 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int a= in.nextInt();
    	int b= in.nextInt();
    	int c= in.nextInt();
    	String tmp = Integer.toString(a*b*c);
    	int[] arr = new int[tmp.length()];		//곱 결과를 집어넣을 배열 
    	int[] st = new int[10];				//숫자를 셀 배열 
    	
    	for(int j=0; j<tmp.length(); j++) {
    		arr[j] = tmp.charAt(j)-'0';
    		for(int i =0; i<10; i++) {
    			if(i==arr[j])
    				st[i]++;
    		}
    	}
    	for(int i=0;i<10;i++) {
    		System.out.println(st[i]);
    	}
    }
}