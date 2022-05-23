import java.util.Scanner;
public class For2739 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int result=1;
		
		for(int i=1;i<=9;i++) {
			result=n*i;
			System.out.println(n+" * "+i+" = "+result);
		}

	}

}
