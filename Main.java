import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Insertion insertion = new Insertion();
		Selection selection = new Selection();
		Bubble bubble = new Bubble();
		Quick quick = new Quick();
		Merge merge = new Merge();
		System.out.println("����ũŰ�� �Է����ּ���.");
		int size = sc.nextInt();
		int[] numbers =new int[size];
		int[] insertionNumbers = new int[size];
		int[] selectionNumbers = new int[size];
		int[] bubbleNumbers = new int[size];
		int[] quickNumbers = new int[size];
		int[] mergeNumbers = new int[size];
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = random.nextInt(10000);
			insertionNumbers[i] = numbers[i];
			selectionNumbers[i] = numbers[i];
			bubbleNumbers[i] = numbers[i];
			quickNumbers[i] = numbers[i];
			mergeNumbers[i] = numbers[i];
		}
		System.out.print("�����ϱ��� ���� : ");
		for(int a=0;a<numbers.length;a++) {
			System.out.print(numbers[a]+" ");
		}
		System.out.print("\n");
		long insertionFirst = System.nanoTime();
		insertionNumbers = insertion.insertion(insertionNumbers);
		long insertionLast = System.nanoTime();
		long insertionTime = insertionLast-insertionFirst;
		long selectionFirst = System.nanoTime();
		selectionNumbers = selection.selection(selectionNumbers);
		long selectionLast = System.nanoTime();
		long selectionTime = selectionLast-selectionFirst;
		long bubbleFirst = System.nanoTime();
		bubbleNumbers = bubble.bubble(bubbleNumbers);
		long bubbleLast = System.nanoTime();
		long bubbleTime = bubbleLast-bubbleFirst;
		long mergeFirst = System.nanoTime();
		merge.split(mergeNumbers);
		long mergeLast = System.nanoTime();
		long mergeTime = mergeLast-mergeFirst;
		long quickFirst = System.nanoTime();
		quick.quick(quickNumbers);
		long quickLast = System.nanoTime();
		long quickTime = quickLast-quickFirst;
		System.out.print("������ �� ���� : ");
		for(int b=0;b<quickNumbers.length;b++) {
			System.out.print(quickNumbers[b]+" ");
		}
		System.out.print("\n");
		ArrayList<TimeRank> rank = new ArrayList<>();
		rank.add(new TimeRank("��������",insertionTime));
		rank.add(new TimeRank("��������",selectionTime));
		rank.add(new TimeRank("��������",bubbleTime));
		rank.add(new TimeRank("�� ����",quickTime));
		rank.add(new TimeRank("�պ� ����",mergeTime));
		TimeRank temp = new TimeRank(null,0);
		for(int i=0;i<rank.size();i++) {
			for(int j=0;j<i;j++) {
				if(rank.get(i).getTime()<rank.get(j).getTime()) {
					temp = rank.get(i);
					rank.set(i,rank.get(j));
					rank.set(j, temp);
				}
			}
		}
		System.out.println("-------------���� �ð��� ���� ���-------------");
		for(int i=0;i<rank.size();i++) {
			System.out.println((i+1)+"�� :"+rank.get(i).getName()+" : "+rank.get(i).getTime()+" nanotime");
		}
}
}