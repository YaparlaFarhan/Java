package com.encap.op;

public class Area {
	private int length;
	private int breadth;

	public Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	public int getArea() {
		return length * breadth;
	}

	public static void main(String[] args) {
		Area a = new Area(10, 20);
		System.out.println(a.getArea());
		System.out.println(a.getBreadth());
		System.out.println(a.getLength());
	}
}
