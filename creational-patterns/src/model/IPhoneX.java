package model;

public class IPhoneX extends IPhone {

    public IPhoneX(String color) {
        super("iphone x", color);
    }

    @Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 3Gb RAM");
		System.out.println("\t- 256Gb Memory");
	}
}
