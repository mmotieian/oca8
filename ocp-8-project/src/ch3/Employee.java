package ch3;

class Employee {
	String name;
	int age;

	Employee() {
		this(2);
	}
	
	Employee(int i) {
		//this();
	}

	Employee(String newName, int newAge) {
		name = newName;
		age = newAge;
	}
}