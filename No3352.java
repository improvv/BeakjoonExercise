import java.util.Scanner;

public class No3352 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[10];
		int count = 0;
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = in.nextInt()%42;
		}
		
		for(int i=0; i<arr.length;i++) {
			int sameCount = 0;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j])
					sameCount++;
			}
			if(sameCount==0)
				count++;
		}
		System.out.println(count);
	}
}
