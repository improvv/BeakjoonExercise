import java.util.Scanner;

public class No8958 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int sum =0, a=0;
		String str;
		
		for(int i=0; i<n;i++) {
			str = in.next();
			char arr[] = str.toCharArray();
			a=0;
			for(int j=0; j<arr.length;j++) {
				if(arr[j]=='O') {
					a++;
					sum+=a;
				}else
					a=0;
				}
				System.out.println(sum);
				sum=0;
			}			
		}
	}

