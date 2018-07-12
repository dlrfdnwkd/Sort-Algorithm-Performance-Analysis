
public class Quick {
	public void quick(int[] numbers) {
		if(numbers.length>1) {
			if(numbers.length>2) {
		int middleIndex = 0;
		int leftIndex = 1;
		int rightIndex = numbers.length-1;
		int temp = 0;
		//int leftTemp = 0;
		//int rightTemp = 0;
		boolean leftNumber = false;
		boolean rightNumber = false;
		while(leftIndex<rightIndex) {
			if(numbers[0]<numbers[leftIndex]) {
				//leftTemp = numbers[leftIndex];
				leftIndex--;
				leftNumber = true;
			}
			if(numbers[0]>numbers[rightIndex]) {
				//rightTemp = numbers[rightIndex];
				rightIndex++;
				rightNumber = true;
			}
			if(leftNumber == true && rightNumber == true) {
				temp = numbers[leftIndex+1];
				numbers[leftIndex+1] = numbers[rightIndex-1];
				numbers[rightIndex-1] = temp;
				leftIndex++;
				rightIndex--;
			}
			leftIndex++;
			rightIndex--;
			leftNumber = false;
			rightNumber = false;
		}
		if(leftIndex!=rightIndex) {
			temp = numbers[0];
			numbers[0] = numbers[rightIndex];
			numbers[rightIndex] = temp;
			middleIndex = rightIndex;
		}else {
			if(numbers[0]>numbers[leftIndex]) {
				temp = numbers[0];
				numbers[0] = numbers[rightIndex];
				numbers[rightIndex] = temp;
				middleIndex = rightIndex;
			}else {
				temp = numbers[0];
				numbers[0] = numbers[rightIndex-1];
				numbers[rightIndex-1] = temp;
				middleIndex = rightIndex-1;
			}
		}
		int[] leftArray = new int[middleIndex];
		int[] rightArray = new int[numbers.length-middleIndex-1];
		for(int i=0;i<leftArray.length;i++) {
			leftArray[i] = numbers[i];
		}
		for(int i=0;i<rightArray.length;i++) {
			rightArray[i] = numbers[middleIndex+1+i];
		}
		quick(leftArray);
		quick(rightArray);
		merge(numbers,leftArray,rightArray);
			}else {
				int temp = 0;
				if(numbers[0]>numbers[1]) {
					temp = numbers[1];
					numbers[0] = numbers[1];
					numbers[1] = temp;
				}
			}
		}else {
			return;
		}
	}
	public void merge(int[] numbers,int[] leftArray,int[] rightArray) {
		for(int i=0;i<leftArray.length;i++) {
			numbers[i] = leftArray[i];
		}
		for(int i=0;i<rightArray.length;i++) {
			numbers[leftArray.length+i+1] = rightArray[i];
		}
	}
}
