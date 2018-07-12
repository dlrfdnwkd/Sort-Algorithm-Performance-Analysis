
public class Bubble {
	public int[] bubble(int[] numbers) {
		int temp = 0;
		boolean keep = true;
		do {
			keep = true;
			for(int i=0;i<numbers.length-1;i++) {
				if(numbers[i]>numbers[i+1]) {
					temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
					keep = false;
				}
			}
		}while(keep==false);
		return numbers;
	}
}
