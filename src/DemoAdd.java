
public class DemoAdd {
	public static void main(String[] args) {
		Addable a = new Addable() {

			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		System.out.println(a.add(9, 6));
		System.out.println("Hi.......");

	}

}
