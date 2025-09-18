package factory_method.half_simple_factory_method;

import model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIphone(String level) {
        IPhone device = null;

        device = createIPhone(level);

        System.out.println(device.getName());
        System.out.println(device.getColor());
        device.getHardware();

        return device;
    }

    protected abstract IPhone createIPhone(String level);
}
