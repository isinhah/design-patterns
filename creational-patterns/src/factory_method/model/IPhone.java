package factory_method.model;

public abstract class IPhone {

    private final String name;
    private final String color;

    public IPhone(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    // método para a subclasse implementar
	public abstract void getHardware();

    // método genérico
	public void pack() {
		System.out.println("Packing the device");
	}
}