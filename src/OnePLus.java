
public class OnePLus {
	public static void main(String[] args) {
		Phone p = new Phone() {

			@Override
			public void givePhone() {
				System.out.println("One Plus Nord");
			}
		};
		p.givePhone();
	}

}
