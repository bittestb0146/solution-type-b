package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		//
		// 코드를 완성 하십시오.
		//
		int[] result = {0,0};
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0 ; j < arr.length; j++) {
				if(arr[i] != arr[j] && arr[i]*arr[j] > result[0]*result[1]) {
					result[0] = arr[i];
					result[1] = arr[j];
				}
			}			
		}
		System.out.println("["+result[0]+","+result[1]+"]");
		
	}
}
