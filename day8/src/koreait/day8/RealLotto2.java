package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class RealLotto2 {
	public static void main(String[] args) {
		int [] numbers = new int[45];
		Random r = new Random();
		
		for(int i=0;i<45;i++) {		//인덱스 범위: 0~44
			numbers[i]=i+1;			//값의 범위: 1~45
		}
		System.out.println("numbers 배열 초기값--------------------");
		System.out.println(Arrays.toString(numbers));
		System.out.println("-----------------------------------");
	// 어느 한 인덱스의 값을 빼고 뒤의 값들을 한칸씩 앞으로 땡겨온다.
		int [] lotto = new int[6];
		int k;		//삭제할 위치의 인덱스 
		for(int cnt=0;cnt<6;cnt++) {
		
			k=r.nextInt(45-cnt);	//경계값을 45(0~44), 44(0~43) 선택되는 범위(바운드)
			System.out.println("k="+ k +", number="+numbers[k]); 	//몇 번째 인덱스일까요?
			lotto[cnt]=numbers[k]; 
			
			for(int i=k;i<numbers.length-1;i++) {
				numbers[i]=numbers[i+1];	
			}
			System.out.println(Arrays.toString(numbers));
			}
		System.out.print("최종 선택 숫자: ");
		System.out.println(Arrays.toString(lotto));
		
		Arrays.sort(lotto);	
		System.out.print("최종 선택 숫자: ");
		System.out.println(Arrays.toString(lotto));
		
		
		
/*		int k=11;		//삭제할 위치의 인덱스 :11번째 인덱스
		for(int i=k;i<numbers.length-1;i++) {
			numbers[i]=numbers[i+1];	//인덱스 i의 배열값을  인덱스 i+1의 값으로 변경
		}
		System.out.println(Arrays.toString(numbers));
		
		k=23;		//삭제할 위치의 인덱스
		for(int i=k;i<numbers.length-1;i++) {
			numbers[i]=numbers[i+1];	//인덱스 i의 배열값을  인덱스 i+1의 값으로 변경
		}
		System.out.println(Arrays.toString(numbers));
		
		k=7;		//삭제할 위치의 인덱스
		for(int i=k;i<numbers.length-1;i++) {
			numbers[i]=numbers[i+1];	//인덱스 i의 배열값을  인덱스 i+1의 값으로 변경
		}
		System.out.println(Arrays.toString(numbers));
*/
		
		
		
		
	}

}
