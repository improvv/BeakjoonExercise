import java.util.Scanner;

public class No5622 {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String s = in.next();
			
			char[] arr = s.toCharArray();
			int sec = 0, sum=0;
			
			for(int i=0; i<arr.length; i++) {
				if('A'<=arr[i]&&arr[i]<='C') {
					sum+=3;
				}else if('D'<=arr[i]&&arr[i]<='F') {
					sum+=4;
				}else if('G'<=arr[i]&&arr[i]<='I') {
					sum+=5;
				}else if('J'<=arr[i]&&arr[i]<='L') {
					sum+=6;
				}else if('M'<=arr[i]&&arr[i]<='O') {
					sum+=7;
				}else if('P'<=arr[i]&&arr[i]<='S') {
					sum+=8;
				}else if('T'<=arr[i]&&arr[i]<='V') {
					sum+=9;
				}else if('W'<=arr[i]&&arr[i]<='Z') {
					sum+=10;
				}
			}
			System.out.print(sum);

	}

}

