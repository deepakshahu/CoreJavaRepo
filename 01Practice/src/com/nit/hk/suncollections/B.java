package com.nit.hk.suncollections;

public class B {
	private int x;
	private int y;

	public B(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "B(" + x + ", "+ y + ")";
	}
	
	@Override
	public int hashCode() {
		return x + y;
	}
	
	/*@Override
	public boolean equals(Object obj) {
		if(obj instanceof B b) {
			return this.x == b.x && this.y == b.y;
		}
		return false;
	}*/
	
}
