package factory_method.factory;

import factory_method.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIphone() {
        IPhone device;

        device = createPhone();

        System.out.println("Device: " + device.getName());
        System.out.println("Color: " + device.getColor());
        device.getHardware();
        device.pack();

        return device;
    }

    protected abstract IPhone createPhone();
}