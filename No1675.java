import java.util.Scanner;

public class No1675 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i=0; i<n; i++) {
			int a = in.nextInt();
			char st[] =in.next().toCharArray();
			for(int j=0; j<st.length; j++)
				for(int z=0; z<a;z++) {
					System.out.print(st[j]);
				}
			System.out.println();
		}
	}

}
