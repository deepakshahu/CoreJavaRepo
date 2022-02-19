package com.nit.hk.suncollections;

import java.util.Arrays;

public class MyCollection {

	public Object[] objArray = new Object[10];;
	private int elementCount = 0;

	public void add(Object obj) {
		if(elementCount==objArray.length) {
			increaseCapacity();
		}
		objArray[elementCount] = obj;
		elementCount++;
	}

	private void increaseCapacity() {
		int newCapacity = objArray.length*2;
		Object[] nextArray = new Object[newCapacity];
		for(int i = 0; i < objArray.length; i++) {
			nextArray[i] = objArray[i];
		}
		objArray = nextArray;
	}

	public int capacity() {
		return objArray.length;
	}

	public int size() {
		return elementCount;
	}

	public Object get(int index) {
		if(index<0 || index>=size())
			throw new IndexOutOfBoundsException("Index :: "+index);
		else
			return objArray[index];
	}

	public void replace(int index, Object obj) {
		if(index<0 || index>=size())
			throw new IndexOutOfBoundsException("Index :: "+index);
		else
			objArray[index] = obj;
	}

	public void remove(int index) {
		if(index<0 || index>=size())
			throw new IndexOutOfBoundsException("Index :: "+index);
		else
			while(index < size()-1) {
				objArray[index] = objArray[index+1];
				index++;
			}
		objArray[index]=null;
		elementCount--;
	}

	public void insert(int index, Object obj) {
		if(index<0 || index>size())
			throw new IndexOutOfBoundsException("Index :: "+index);
		else if(size()==capacity())
			increaseCapacity();
		else
			for(int i = size()-1; i >= index; i--){
				objArray[i+1] = objArray[i];
			}
		objArray[index] = obj;
		elementCount++;
	}

	@Override
	public String toString() {
		return "MyCollection [objArray=" + Arrays.toString(objArray) + "]";
	}

}//class