package com.test.question.q98;

public class Student {

	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private int number;

	public Student() {
		this("미정", 0, 0, 0, 0);
	}

	public Student(String name, int age, int grade, int classNumber, int number) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
	}

	public Student(String name, int age) {
		this(name, age, 0, 0, 0);
	}

	public Student(int grade, int classNumber, int number) {
		this("미정", 0, grade, classNumber, number);
	}

	String info() {
		String ageStr = (this.age != 0) ? this.age + "세" : "미정";
		String gradeStr = (this.grade != 0) ? this.grade + "" : "미정";
		String classNumberStr = (this.classNumber != 0) ? this.classNumber + "" : "미정";
		String numberStr = (this.number != 0) ? this.number + "" : "미정";

		return String.format("%s(나이 : %s, 학년 : %s, 반 : %s, 번호 : %s)", this.name, ageStr, gradeStr, classNumberStr,
				numberStr);
//		return String.format("%s(나이 : %s, 학년 : %s, 반 : %s, 번호 : %s)", this.name,
//				(this.age == 0) ? "미정" : this.age + "세", (this.grade == 0) ? "미정" : this.grade + "",
//				(this.classNumber == 0) ? "미정" : this.classNumber + "", (this.number == 0) ? "미정" : this.number + "");

	}
}
