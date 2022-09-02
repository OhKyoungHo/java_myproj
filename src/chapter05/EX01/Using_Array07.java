package chapter05.EX01;

public class Using_Array07 {

	public static void main(String[] args) {
		// 배열 변수의 값 대입 방법 1
		//	배열을 선언 → 초기화 → 값을 대입
		// 	<<선언과 초기화를 분리 가능>>
		int [] arr1 = new int[3];		//index : 0, 1, 2 //(주의 : 방 갯수 지정하지 않으면 오류)
		
		int[] arr11;			//선언
		arr11 = new int[3]; 	// 초기화
		
		
		//대입 방법 2; 선언과 동시에 값을 할당(주의 : 방의 갯수는 지정하면 오류)
		//	 	<<선언과 초기화를 분리 가능>>
		int[] arr2 = new int[] {1,2,3,4,5,6,7,8,9,10};
		for(int i =0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
		int[]arr22;							//선언
		arr22 = new int[] {22,33,44,55};	//초기화
		
		System.out.println("==");
		//대입 방법 3; (new int[]) 생략 후 바로 값 할당.
		//	-- 선언과 초기화를 분리할 수 없다.
		int [] arr3 = {11,12,13,14,15};
		for(int i=0 ; i<arr3.length ; i++ ) {
			System.out.println(arr3[i]);
		}
	
		/*
		 int[] arr33 ;
		 arr33 = {77,88,99};		//오류발생, 분리해서 쓸수 없다. */
		
		

	}

}
