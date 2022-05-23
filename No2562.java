
import java.util.Scanner;

public class No2562 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int[] arr = new int[9];
    	int max = 0, count = 0;
    	
    	for(int i=0;i<9;i++) {
    		arr[i]=in.nextInt();
    		if(max<arr[i]) {
    			max=arr[i];
    			count = i+1;
    		}
    	}
    	System.out.println(max);
    	System.out.println(count);
    }
}