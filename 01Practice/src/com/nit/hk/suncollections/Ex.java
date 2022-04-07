package com.nit.hk.suncollections;

public class Ex {
	private int x;
	private int y;
	
	public Ex(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/*@Override
	public boolean equals(Object obj) {
		if(obj instanceof Ex a) {
			return this.x == a.x && this.y == a.y;
		}
		return false;
	}*/
	
	@Override
	public int hashCode() {
		return x + y;
	}

	@Override
	public String toString() {
		return "Ex (x=" + x + ", y=" + y + ")";
	}
}
