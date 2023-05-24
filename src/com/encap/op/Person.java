package com.encap.op;

public class Person {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Shemaroo");
		p.setAge(50);

		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
}
