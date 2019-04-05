package com.reg.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class IteratorAndTree {
	static CollectionsDemo c = new CollectionsDemo();

	/* Array List */
	public static List<String> testingArrayListSort() {
		List<String> ar = c.getArrayList();
		Collections.sort(ar);

		/* Using enhansed for loop */
		System.out.println("\nEnhansed for loop:");
		for (String s : ar)
			System.out.print(s + "  ");

		/* Using Iterator */
		Iterator<String> it = ar.iterator();
		System.out.println("\n\nIterator Concept:");
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + "****");
		}

		/* Using ListIterator */
		ListIterator<String> lit = ar.listIterator(ar.size());
		System.out.println("\n\nListIterator Concept:");
		while (lit.hasPrevious()) {
			String s = lit.previous();
			System.out.print(s + "---");
		}
		return ar;
	}

	/* Linked List */
	public static List<String> testingLinkedListSort() {
		LinkedList<String> ar = c.getLinkedList();
		Collections.sort(ar);
		for (String s : ar)
			System.out.print(s + " --  ");
		return ar;
	}

	/* Tree Set (Automatically Sorted Hash Set) */
	public static void testingTreeSet() {
		TreeSet<String> arr = new TreeSet<>();
		arr.add("Apple");
		arr.add("Apple");
		arr.add("Motorola");
		arr.add("One+");
		arr.add("Nokia");
		arr.add("Mi");
		arr.add("Samsung");
		System.out.println("\n\nTree Set -*-*-*-* \n" + arr);
		String s = arr.first();/* To get First Element */
		System.out.println("first() :-:-:-:-: " + s);
		String last = arr.last();/* To get Last Element */
		System.out.println("last() :-:-:-:-: " + last);
		String least = arr.higher("Motorola");/* To get Lest Element */
		System.out.println("Least Element than 'Motorola'---- higher(\"Motorola\") *-*-*-*  " + least);
		String highest = arr.lower("Motorola");
		System.out.println("Highest Element than 'Motorola'---- lower(\"Motorola\") *-*-*-*  " + highest);
		String floor = arr.floor("S");
		System.out.println(
				"To get the greatest element in this set less than or equal to the given element ---- floor(\"S\") *-*-*-*  "
						+ floor);
		String pollFst = arr.pollFirst();
		System.out.println("First Elelment Deleting  ----***---" + pollFst);
		String pollst = arr.pollFirst();
		System.out.println("Second Elelment Deleting  ----***---" + pollst);
		String pollLst = arr.pollLast();
		System.out.println("Last Elelment Deleting  ----***---" + pollLst);
		System.out.println("After Deleting First, Second & Last Element: " + arr);
		arr.clear();/* To Clear All */
		System.out.println("clear() -*-*-* " + arr);
	}

	/* Tree Map (Automatically Sorted Hash Map) */
	public static void testingTreeMap() {
		TreeMap<Integer, String> arr = new TreeMap<>();
		arr.put(1, "Apple");
		arr.put(11, "Apple");
		arr.put(2, "Motorola");
		arr.put(12, "One+");
		arr.put(4, "Nokia");
		arr.put(5, "Mi");
		arr.put(6, "Samsung");
		System.out.println("\n\nTree Map -*-*-*-* \n"+"Automatically Sort with reference to 'Key' \n" + arr);

		/* Enhansed for loop by using Key Set -- Set<Integer> */
		Set<Integer> keySetEnhansed = arr.keySet();
		System.out.println("\nEnhansed for loop by using Key Set :-:-:-: ");
		for (Integer i : keySetEnhansed) {
			String s = arr.get(i);
			System.out.println(i + " " + s);
		}

		/* Enhansed for loop by using Map-Entry */
		System.out.println("\nEnhansed for loop by using Map-Entry :-:-:-: ");
		for (Map.Entry<Integer, String> entry : arr.entrySet()) {
			Integer i = entry.getKey();
			String s = arr.get(i);
			System.out.println(i + " " + s);
		}

		/* Iterator Concept - Tree Set */
		Set<Integer> keySetforIterator = arr.keySet();
		System.out.println("\nIterator Concept - Tree Set :-:-:-: ");
		Iterator<Integer> ite = keySetforIterator.iterator();
		while (ite.hasNext()) {
			Integer i = ite.next();
			String s = arr.get(i);
			System.out.println(i + " " + s);
		}

	}

	public static void main(String[] args) {
		testingArrayListSort();
		testingLinkedListSort();
		testingTreeSet();
		testingTreeMap();
	}
}
