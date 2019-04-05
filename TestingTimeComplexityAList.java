package com.reg.collections;

import java.util.ArrayList;

public class TestingTimeComplexityAList {
	public long testingTimeComplexityArrayList() {
		ArrayList<Integer> test = new ArrayList<>();
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
		System.out.println("Array List: " + l);
		return l;
	}
}
