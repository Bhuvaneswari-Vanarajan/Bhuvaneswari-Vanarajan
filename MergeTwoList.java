package javaLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoList {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(7);
		System.out.println("List1 - "+list1);
		List<Integer> list2=new ArrayList<>();
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(8);
		System.out.println("List2 -"+list2);
		List<Integer> mergeList = new ArrayList<>();
		mergeList.addAll(list1);
		mergeList.addAll(list2);
		Collections.sort(mergeList);
		System.out.println("Sorted List is :");
		System.out.println(mergeList);
	}

}
