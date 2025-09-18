package factory_method.model;

public class IPhone11Pro extends IPhone {

    public IPhone11Pro(String color) {
        super("iphone 11 pro", color);
    }

    @Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 512Gb Memory");
	}
}
