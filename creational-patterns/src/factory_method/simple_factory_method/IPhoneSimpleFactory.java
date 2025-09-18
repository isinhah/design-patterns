package factory_method.simple_factory_method;

import factory_method.model.IPhone;
import factory_method.model.IPhone11;
import factory_method.model.IPhone11Pro;
import factory_method.model.IPhoneX;

public class IPhoneSimpleFactory {

    public static IPhone orderIPhone(String generation, String level, String color) {
        IPhone device = null;

        if (generation.equals("X")) {
            if (level.equals("standard")) {
                device = new IPhoneX(color);
            }
        } else if (generation.equals("11")) {
            if(level.equals("standard")) {
                device = new IPhone11(color);
            } else if(level.equals("highEnd")) {
                device = new IPhone11Pro(color);
            }
        }

        if (device != null) {
            System.out.println("Device: " + device.getName() + " | Color: " + device.getColor());
            device.getHardware();
            device.pack();
        }

        return device;
    }
}
