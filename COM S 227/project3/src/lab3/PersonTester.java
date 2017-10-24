package lab3;

public class PersonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Ram";
		int age = 27;
		
		Person person = new Person(name, age);
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getNameLength());

	}

}
