import java.util.Scanner;

public class No4344 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int c = in.nextInt();
		
		for(int i=0; i<c; i++) {
			int sum =0, avg = 0, s=0;	//variables  
			int a = in.nextInt();		//반의 학생 수 입력 
			int arr[] =new int[a];		//학생별 점수 배열 생성 
			for(int j=0; j<a; j++) {	
				int n = in.nextInt();	//점수 입력 
				arr[j] = n;				//배열에 입력 
				sum += arr[j];
				if(j==a-1) {			//마지막 배열일때 
					avg = sum/a;			//반 평균구하기 
					for(int x=0; x<a; x++) {
						if(arr[x]>avg) { 	 //학생 평균초과이면 s에 1씩 추가 
							s++;
						}
					}
				}
			}
			double r = (double)s / a * 100;
			System.out.println(String.format("%.3f", r)+"%");
		}
	}
}
