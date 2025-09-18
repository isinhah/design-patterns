package factory_method.factory;

import model.IPhone;
import model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {
    @Override
    protected IPhone createPhone() {
        return new IPhone11("black");
    }
}