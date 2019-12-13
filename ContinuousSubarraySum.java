package Important.Arrays;

public class ContinuousSubarraySum {
	public static void main(String[] args) {
		int arr[] = { 5, 14, 12, 6, 8,32 };
		int sum =26;
		findCountSumArr(arr, sum);
	}

	private static void findCountSumArr(int[] arr, int num) {
		String rev= "";
		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				sum += arr[j];
				if (sum > num) {
					break;
				}
				if (sum == num) {
					for (int j2 = i; j2 <= j; j2++) {
						System.out.print("["+arr[j2] + " ]");
						
					}
					System.out.println();
				}
			}
			
		}
		
		
	}

}
