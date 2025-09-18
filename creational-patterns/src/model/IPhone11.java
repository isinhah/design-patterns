package model;

public class IPhone11 extends IPhone {

    public IPhone11(String color) {
        super("iphone 11", color);
    }

    @Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 256Gb Memory");
	}
}
