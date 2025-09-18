package factory_method.half_simple_factory_method;

import model.IPhone;
import model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhoneX(level);
        } else {
            return null;
        }
    }
}
