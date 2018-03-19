package com.learnjava.course;

import java.util.ArrayList;

public class GenericArray<T>{
	private ArrayList <T> arrayContainer = new ArrayList<T>();
	
	public void put(int index, T item) {
		arrayContainer.add(index, item);
	}
	
	public T get(int index) {
		return arrayContainer.get(index);
	}
	public boolean isEmpty() {
		return arrayContainer.isEmpty();
	}
	public int size() {
		return arrayContainer.size();
	}
}
