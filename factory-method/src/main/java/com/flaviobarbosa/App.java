package com.flaviobarbosa;

import com.flaviobarbosa.factory.v1.IPhone15Factory_V1;
import com.flaviobarbosa.factory.v1.IPhone15PlusFactory_V1;
import com.flaviobarbosa.factory.v1.IPhone15ProFactory_V1;
import com.flaviobarbosa.factory.v1.IPhone15ProMaxFactory_V1;
import com.flaviobarbosa.factory.v1.IPhoneFactory_V1;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        IPhoneFactory_V1 iphone15Factory = new IPhone15Factory_V1();
        iphone15Factory.orderIPhone();
        System.out.println(iphone15Factory);

        IPhoneFactory_V1 iphone15PlusFactory = new IPhone15PlusFactory_V1();
        iphone15PlusFactory.orderIPhone();
        System.out.println(iphone15PlusFactory);

        IPhoneFactory_V1 iphone15ProFactory = new IPhone15ProFactory_V1();
        iphone15ProFactory.orderIPhone();
        System.out.println(iphone15ProFactory);

        IPhoneFactory_V1 iphone15ProMaxFactory = new IPhone15ProMaxFactory_V1();
        iphone15ProMaxFactory.orderIPhone();
        System.out.println(iphone15ProMaxFactory);
    }
}
