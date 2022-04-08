package step11;

/*
 * <입력>
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 
 * 둘째 줄부터 N개의 줄에는 수 주어진다. 
 * 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 
 * <출력>
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */
import java.util.Scanner;

public class B2750 { 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();		// 입력받는 숫자 갯수
		
		int[] arr = new int[count];
		int temp;
		
		// count 갯수만큼 입력 받기
		for(int i=0; i<count; i++) {
			arr[i] = scan.nextInt();
		}
		
		// 배열 정리하기
		for(int i=0; i<count; i++) {	
			for(int j=0; j<count-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<count; i++) {	
			System.out.println(arr[i]);
		}
	}
}
