package com.example.forygsoft;

public class Student {
	private String name;
	private int age;
	private Address addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	protected Object clone()   {
		Student student=null;
		try {
			//浅拷贝
			student=(Student)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		//深拷贝
		student.addr=(Address) addr.clone();
		return student;
	}
   
}
