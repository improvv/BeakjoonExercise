import java.util.Scanner;
public class For2439 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	
			for(int i=1; i<=n; i++) {
				for(int j=i;j<n;j++)
					System.out.print(" ");
				for(int p=1;p<=i;p++)
					System.out.print("*");
				System.out.println();
			}
			
		}	
	}
