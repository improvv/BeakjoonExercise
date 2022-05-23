import java.util.Scanner;

public class No1546 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		double arr[] = new double[n];
		double max = 0;
		double sum = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = in.nextDouble();
		}
		
		for(double i : arr) max = Math.max(i, max);

		for(int i=0; i<n; i++) {
			arr[i] = (arr[i]/max)*100;
			sum+=arr[i];
		}
		System.out.println(sum/n);
}
}
