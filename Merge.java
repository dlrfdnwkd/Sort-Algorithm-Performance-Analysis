
public class Merge {
		public void split(int[] numbers) {
			if(numbers.length>1) {
			int[] left = new int[numbers.length/2];
			int[] right = new int[numbers.length-left.length];
			for(int i=0;i<left.length;i++) {
				left[i] = numbers[i];
			}
			for(int i=0;i<right.length;i++) {
				right[i] = numbers[left.length+i];
			}
			split(left);
			split(right);
			merge(numbers,left,right);
		}else {
			return;
		}
		}
		public void merge(int[] numbers,int[] left,int[] right) {
			int leftIndex = 0;
			int rightIndex = 0;	
			for(int i=0;i<numbers.length;i++) {
				if(leftIndex<left.length) {
					if(rightIndex<right.length) {
						if(left[leftIndex]>right[rightIndex]) {
							numbers[i] = right[rightIndex];
							rightIndex++;
						}else {
							numbers[i] = left[leftIndex];
							leftIndex++;
						}
					}else {
						numbers[i] = left[leftIndex];
						leftIndex++;
					}
				}else {
					if(rightIndex<right.length) {
						numbers[i] = right[rightIndex];
						rightIndex++;
					}
				}
			}
		}
}
