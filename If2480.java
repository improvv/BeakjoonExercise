import java.util.Scanner;
public class If2480 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int sum = 0;
		if(a==b&&b==c)
			sum = 10000+(1000*a);
		else if(a==b||b==c||a==c) {
			if(a==b||a==c)
				sum = 1000+(a*100);
			else
			sum = 1000+(c*100);}
			
		else {
			if(a>b&&a>c)
				sum = a*100;
			else if(b>a&&b>c)
				sum = b*100;
			else
				sum = c*100;
		}
		System.out.println(sum);
	}

}