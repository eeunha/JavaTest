package com.test.question.q95;

class Employee {
	private String name;
	private String department;
	private String position;
	private String tel;
	private Employee boss;

	// getter, setter 구현

	public void info() {
		System.out.printf("[%s]\n", getName());
		System.out.println("- 부서: " + getDepartment());
		System.out.println("- 직위: " + getPosition());
		System.out.println("- 연락처: " + getTel());
		System.out.print("- 직속상사: ");
		if (getBoss() == null) {
			System.out.println("없음");
		} else {
			Employee curBoss = getBoss();
			System.out.printf("%s(%s %s)", curBoss.getName(), curBoss.getDepartment(), curBoss.getPosition());
		}
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 2 || name.length() > 5) {
			return;
		}

		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (c < '가' || c > '힣') {
				return;
			}
		}

		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		if (department.equals("영업부") || department.equals("기획부") || department.equals("총무부") || department.equals("개발부")
				|| department.equals("홍보부")) {
			this.department = department;
		}
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		if (position.equals("부장") || position.equals("과장") || position.equals("대리") || position.equals("사원")) {
			this.position = position;
		}
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		if (!tel.startsWith("010-") || tel.charAt(8) != '-' || tel.length() != 13) {
			return;
		}

		String temp = tel.substring(4);
		temp = temp.replace("-", "");

		for (int i = 0; i < temp.length(); i++) {
			char c = temp.charAt(i);
			if (c < '0' || c > '9') {
				return;
			}
		}

		this.tel = tel;
	}

	public Employee getBoss() {
		return boss;
	}

	public void setBoss(Employee boss) {
		if (boss == null)
			return;

		// 같은사람인가? 안의 값 모두 비교
		if (this.name.equals(boss.getName()) && this.department.equals(boss.getDepartment())
				&& this.position.equals(boss.getPosition()) && this.tel.equals(boss.getTel())) {
			return;
		}

		// 같은 부서인가?
		if (!this.department.equals(boss.getDepartment())) {
			return;
		}
		
		this.boss = boss;
	}
}