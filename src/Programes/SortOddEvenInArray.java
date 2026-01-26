package Programes;

public class SortOddEvenInArray {

	// two pinter method

	public static void main(String[] args) {

		int[] numbers = { 10, 78, 44, 88 };
		for (int number : sortOddEven(numbers)) {
			System.out.print("\s" + number);
		}
	}

	public static int[] sortOddEven(int[] numbers) {
		int start = 0, end = numbers.length - 1;

		while (start < end) {
			while (start < end && numbers[start] % 2 == 0) {
				start++;
			}
			while (start < end && numbers[end] % 2 != 0) {
				end--;
			}
			if (start < end) {
				int temp = numbers[start];
				numbers[start] = numbers[end];
				numbers[end] = temp;
				start++;
				end--;
			}
		}
		return numbers;
	}
}
