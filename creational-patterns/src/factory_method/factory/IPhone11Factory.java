package factory_method.factory;

import factory_method.model.IPhone;
import factory_method.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {
    @Override
    protected IPhone createPhone() {
        return new IPhone11("black");
    }
}