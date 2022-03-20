
class TestSingleton {

	private static TestSingleton obj = new TestSingleton();
	private TestSingleton() {
	}

	public static TestSingleton getInstance () {
		return obj;
	}

}

public class SingletoneClass {
	public static void main(String[] args) {
		System.out.println(" Obj :: " + TestSingleton.getInstance());
	}
}
