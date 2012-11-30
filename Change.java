class Changes {
	int x = 0;
}

public class Change {
	public static void main(String[] arge) {
		Changes c = new Changes();
		c.x = 20;
		fun(c);
		System.out.println("x =" + c.x);
	}

	public static void fun(Changes ch) {
		ch.x = 35;
	}
}
