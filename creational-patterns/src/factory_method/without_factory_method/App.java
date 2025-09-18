package factory_method.without_factory_method;

import factory_method.model.IPhone;
import factory_method.without_factory_method.service.IphoneService;

public class App {
    public static void main(String[] args) {
        IphoneService iphoneService = new IphoneService();

        IPhone iphone = iphoneService.orderIPhone("X", "standard", "black");
        System.out.println(iphone);

        IPhone iphone2 = iphoneService.orderIPhone("11", "highEnd", "white");
        System.out.println(iphone2);
    }
}