package factory_method.factory;

import factory_method.model.IPhone;

public class App {
    public static void main(String[] args) {
        IPhoneFactory iPhone11Factory = new IPhone11Factory();
        IPhoneFactory iphoneXFactory = new IPhoneXFactory();

        IPhone iphone11 = iPhone11Factory.orderIphone();
        System.out.println(iphone11);

        IPhone iphoneX = iphoneXFactory.orderIphone();
        System.out.println(iphoneX);
    }
}