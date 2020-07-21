package epam.com.Collection_Frameworks;


public class Person {
	int age;
	String name;
	public Person(int x, String y) {
		age=x;
		name=y;
	}
	public String toString() {
		return "Name: "+name+" Age: "+age;
	}
}
