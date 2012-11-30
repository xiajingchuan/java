/**
 * test
 */
class Person {
	private String name;
	private int age;
	
	void talk() {
		System.out.println("wo shi:" + name + ",this year:" + age + "!");
	}

	public void setName(String str) {
		name = str;
	}

	public void setAge(int a) {
		if(a > 0) {
			age = a;
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class TestPersonDemo {
	public static void main(String[] args) {
		Person a = new Person();
		//给a中的属性赋值
		a.setName("呵呵");
		a.setAge(23);
		a.talk();
	}
}
