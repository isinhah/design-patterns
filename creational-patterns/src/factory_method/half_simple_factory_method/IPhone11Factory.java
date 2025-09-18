package factory_method.half_simple_factory_method;

import factory_method.model.IPhone;
import factory_method.model.IPhone11;
import factory_method.model.IPhone11Pro;

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
