package factory_method.factory;

import model.IPhone;
import model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createPhone() {
        return new IPhoneX("white");
    }
}
