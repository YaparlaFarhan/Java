package com.encap.op;

public class Encapsulation {
	private String geekName;
	private int geekAge;
	private int geekRoll;

	public void setGeekName(String name) {
		geekName = name;
	}

	public void setGeekAge(int age) {
		geekAge = age;
	}

	public void setGeekRoll(int roll) {
		geekRoll = roll;
	}

	public String getGeekName() {
		return geekName;
	}

	public int getGeekAge() {
		return geekAge;
	}

	public int getGeekRoll() {
		return geekRoll;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation encapsulation = new Encapsulation();
		encapsulation.setGeekName("Student");
		encapsulation.setGeekAge(20);
		encapsulation.setGeekRoll(01);

		System.out.println(encapsulation.getGeekName());
		System.out.println(encapsulation.getGeekAge());
		System.out.println(encapsulation.getGeekRoll());

	}

}
