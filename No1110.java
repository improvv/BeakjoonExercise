import java.util.Scanner;

public class No1110 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int a = in.nextInt();
    	int x=0, y=0, count=0;
    	int z = a;
    
    	
    		do {	
    			x = z/10;
    			y = z%10;
    			z = x+y;
    			z = (y*10)+(z%10);
    			count ++;
    		}while(z!=a);
    		System.out.println(count);
    	}
    }

