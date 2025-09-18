package factory_method.simple_factory_method;

import model.IPhone;

public class App {
    public static void main(String[] args) {
        IPhone iphone = IPhoneSimpleFactory.orderIPhone("X", "standard", "black");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = IPhoneSimpleFactory.orderIPhone("11", "highEnd", "white");
        System.out.println(iphone2);
    }
}