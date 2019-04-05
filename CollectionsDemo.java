package com.reg.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CollectionsDemo {
	public ArrayList<String> getArrayList() {
		/* ArrayList<data type> ref =new ArrayList<>(); */
		System.out.println("Array List .. .. .!");
		ArrayList<String> aList = new ArrayList<>();
		aList.add("Apple");
		aList.add("Apple");
		aList.add("One+");
		aList.add("Mi");
		aList.add("Nokia");
		aList.add(2, "Motorola");
		System.out.println(aList);
		aList.remove(3);
		// for (String s : aList)
		// System.out.println(s);
		return aList;
	}

	public LinkedList<String> getLinkedList() {
		/* LinkedList<data type> ref = new LinkedList<>(); */
		System.out.println("\n\nLinked List .. .. .!");
		LinkedList<String> lList = new LinkedList<>();
		lList.add("Apple");
		lList.add("Apple");
		lList.add("One+");
		lList.add("Mi");
		lList.add("Nokia");
		// System.out.println(lList);
		lList.add(2, "Motorola");
		// System.out.println(lList);
		// lList.remove(3);
		System.out.println(lList);
		return lList;
	}

	public HashSet<String> getHashSet() {
		/* HashSet<data type> ref = new HashSet<>(); */
		System.out.println("\nHash Set .. .. .!");
		HashSet<String> hSet = new HashSet<>();
		hSet.add("Apple");
		hSet.add("Apple");/* Testing for Duplicate Element */
		hSet.add("One+Six");
		hSet.add("Mi");
		hSet.add("Nokia");
		// System.out.println(hSet);
		hSet.add("Motorola");
		// System.out.println(hSet);
		hSet.remove("Mi");
		System.out.println(hSet);
		HashSet<Integer> het = new HashSet<>();
		het.add(43);
		het.add(45);
		het.add(48);
		het.add(4);
		het.add(6);
		het.add(12);
		System.out.println(het);
		return hSet;
	}

	public LinkedHashSet<String> getLinkedHashSet() {
		/* LinkedHashSet<data type> ref = new LinkedHashSet<>(); */
		System.out.println("\nLinked Hash Set .. .. .!");
		LinkedHashSet<String> lhSet = new LinkedHashSet<>();
		lhSet.add("One");
		lhSet.add("Two");
		lhSet.add("Apple");
		lhSet.add("Apple");/* Testing for Duplicate Element */
		lhSet.add("One+");
		lhSet.add("Mi");
		lhSet.add("Nokia");
		System.out.println(lhSet);
		lhSet.add("Motorola");
		System.out.println(lhSet);
		lhSet.remove("Mi");
		System.out.println(lhSet);
		return lhSet;
	}

	public HashMap<Integer, String> getHashMap() {
		/* HashMap<data type(key), data type(value)> ref = new HashMap<>(); */
		System.out.println("\nHash Map .. .. .!");
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(1, "Apple");
		hMap.put(1, "Apple");/* Testing for Duplicate Element */
		hMap.put(2, "One+");
		hMap.put(3, "Mi");
		hMap.put(4, "Nokia");
		System.out.println(hMap);
		hMap.put(5, "Motorola");
		System.out.println("Getting Object at Key ref 01: " + hMap.get(1));
		hMap.remove(3, "Mi");
		System.out.println(hMap.get(3));/* Removed Element */
		System.out.println(hMap);
		return hMap;
	}

	public LinkedHashMap<Integer, String> getLinkedHashMap() {
		/* LinkedHashMap<data type(key), data type(value)> ref = new HashMap<>(); */
		System.out.println("\nLinked Hash Map .. .. .!");
		LinkedHashMap<Integer, String> lhMap = new LinkedHashMap<>();
		lhMap.put(1, "Apple");
		lhMap.put(1, "Apple");/* Testing for Duplicate Element */
		lhMap.put(2, "One+");
		lhMap.put(3, "Mi");
		lhMap.put(4, "Nokia");
		System.out.println(lhMap);
		lhMap.put(5, "Motorola");
		System.out.println("Getting Object at Key ref 01: " + lhMap.get(1));
		lhMap.remove(3, "Mi");
		System.out.println(lhMap.get(3));/* Removed Element */
		System.out.println(lhMap);
		return lhMap;
	}

	public static void main(String[] args) {
		/* Testing Time Complexity */
		TestingTimeComplexityAList al = new TestingTimeComplexityAList();
		long alist = al.testingTimeComplexityArrayList();
		TestingTimeComplexityLList ll = new TestingTimeComplexityLList();
		long llist = ll.testingTimeComplexityLinkedList();
		long timeDiff = alist - llist;
		System.out.println("Time Complexity Difference:" + timeDiff + "\n");
		CollectionsDemo cd = new CollectionsDemo();
		cd.getArrayList();
		cd.getLinkedList();
		cd.getHashSet();
		cd.getLinkedHashSet();
		cd.getHashMap();
		cd.getLinkedHashMap();
	}

}
