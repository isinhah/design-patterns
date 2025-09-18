package factory_method.half_simple_factory_method;

import factory_method.model.IPhone;

public class App {

    public static void main(String[] args) {
        IPhoneFactory iphoneXFactory = new IPhoneXFactory();
        IPhoneFactory iphone11Factory = new IPhone11Factory();

        IPhone iphone = iphoneXFactory.orderIphone("standard");
        System.out.println(iphone);

        IPhone iphone2 = iphone11Factory.orderIphone("highEnd");
        System.out.println(iphone2);
    }
}
