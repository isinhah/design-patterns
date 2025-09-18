package factory_method.half_simple_factory_method;

import model.IPhone;
import model.IPhone11;
import model.IPhone11Pro;
import model.IPhoneX;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhone11(level);
        } else {
            return new IPhone11Pro(level);
        }
    }
}
