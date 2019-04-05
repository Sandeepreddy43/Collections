package com.reg.collections;

import java.util.LinkedList;

public class TestingTimeComplexityLList {
	public long testingTimeComplexityLinkedList() {
		LinkedList<Integer> test = new LinkedList<>();
		for (int i = 0; i < 10000000; i++) {
			test.add(i);
			if (i == 200) {
				for (int j = 0; j < 60; j++)
					test.remove(j);
			}
			if (i == 600) {
				for (int k = 0; k < 100; k++) {
					test.add(k);
					test.remove(k);
				}
			}
		}
		long l = System.currentTimeMillis();
		System.out.println("Linked List: "+l);
		return l;
	}

}
