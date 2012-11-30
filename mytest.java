//创建类的对象
class myTest {
	public static void main(String[] args) {
		Test3 p;
		p = new Test3();
		p.name = "test";
		p.age = 23;
		p.talk();

		Test3 a = new Test3();
		Test3 b = new Test3();
		a.name = "李四";
		a.age = 24;

		b.name = "王五";
		b.age = 33;

		a.talk();
		b.talk();
	}
}
