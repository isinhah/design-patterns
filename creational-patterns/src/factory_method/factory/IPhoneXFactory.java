package factory_method.factory;

import factory_method.model.IPhone;
import factory_method.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createPhone() {
        return new IPhoneX("white");
    }
}
