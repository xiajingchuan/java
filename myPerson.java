class Person {
	String name;
	int age;

}

public class myPerson {
	public static void main(String[] args) {
		Person a = null;
		Person b = null;

		a = new Person();
		a.name = "一起走过的日子";
		a.age = 25;
		
		b = a;

		System.out.println("名字："+ b.name + "年龄：" + b.age);
		b = null;
		System.out.println("dd"+a.name);
		System.out.println("aa"+b.name);
	}
}
