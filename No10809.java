import java.util.Arrays;
import java.util.Scanner;

public class No10809 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		char s[] = in.next().toCharArray();
		
		int[] arr = new int[26]; 
		char[] al = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		for(int i=0; i<al.length;i++) {
			st : for(int j=0;j<s.length;j++) {
				if(s[j]!=al[i]) {
					arr[i] = -1;
				}else {
					arr[i]=j;
					break st;
				}	
			}
			System.out.print(arr[i]+" ");
		}
	}
}
