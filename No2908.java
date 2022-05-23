
import java.util.Scanner;

public class No2908 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String a = in.next(), b = in.next();
		
		int[] ar = new int[3], br = new int[3];
		
		for(int i=0; i<3; i++) {
			ar[i]=Character.getNumericValue(a.charAt(2-i));
			br[i]=Character.getNumericValue(b.charAt(2-i));
		}		
		
		for(int i=0; i<3; i++) {
			if(ar[i]>br[i]) {
				for(int j=0; j<3; j++)
					System.out.print(ar[j]);
				break ;
			}else if(ar[i]<br[i]){
				for(int j=0; j<3; j++)
					System.out.print(br[j]);
				break ;
			}else {			//same 
				continue;
			}
		}
	}
}
