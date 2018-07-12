
public class Insertion {
	public int[] insertion(int[] numbers) {
		int temp=0;
		for(int j=1;j<numbers.length;j++) {
			for(int a=0;a<j;a++) {
				if(numbers[j]<numbers[a]) {
					temp = numbers[j];
					numbers[j] = numbers[a];
					numbers[a] = temp;
				}
			}
		}
		return numbers;
	}
}
