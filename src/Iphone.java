
public class Iphone implements Phone {

	@Override
	public void givePhone() {
		System.out.println("Iphone 11");
	}

	public static void main(String[] args) {
		Phone i = new Iphone();
		i.givePhone();
	}

}
