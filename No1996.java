import java.util.Arrays;
import java.util.Scanner;

public class No1996 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();		//행, 열 개수 
		char[][]  map= new char[n][n], ans = new char[n][n];
	
		for(int i=0; i<n; i++) {		//입력
			String str = in.next();
			for(int j=0; j<n; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		
		
		
	}

}
