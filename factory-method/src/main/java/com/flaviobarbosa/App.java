package com.flaviobarbosa;

import static com.flaviobarbosa.enums.Generation.IPHONE_15;
import static com.flaviobarbosa.enums.Level.PLUS;
import static com.flaviobarbosa.enums.Level.PRO;
import static com.flaviobarbosa.enums.Level.PRO_MAX;
import static com.flaviobarbosa.enums.Level.STANDARD;

import com.flaviobarbosa.enums.Generation;
import com.flaviobarbosa.enums.Level;
import com.flaviobarbosa.factory.v1.IPhone15Factory_V1;
import com.flaviobarbosa.factory.v1.IPhone15PlusFactory_V1;
import com.flaviobarbosa.factory.v1.IPhone15ProFactory_V1;
import com.flaviobarbosa.factory.v1.IPhone15ProMaxFactory_V1;
import com.flaviobarbosa.factory.v1.IPhoneFactory_V1;
import com.flaviobarbosa.factory.v2.IPhoneSimpleFactory;
import com.flaviobarbosa.model.IPhone;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        //Factory V1
//        IPhoneFactory_V1 iphone15Factory = new IPhone15Factory_V1();
//        iphone15Factory.orderIPhone();
//        System.out.println(iphone15Factory);
//
//        IPhoneFactory_V1 iphone15PlusFactory = new IPhone15PlusFactory_V1();
//        iphone15PlusFactory.orderIPhone();
//        System.out.println(iphone15PlusFactory);
//
//        IPhoneFactory_V1 iphone15ProFactory = new IPhone15ProFactory_V1();
//        iphone15ProFactory.orderIPhone();
//        System.out.println(iphone15ProFactory);
//
//        IPhoneFactory_V1 iphone15ProMaxFactory = new IPhone15ProMaxFactory_V1();
//        iphone15ProMaxFactory.orderIPhone();
//        System.out.println(iphone15ProMaxFactory);

        //Factory V2
        IPhone iPhone1 = IPhoneSimpleFactory.orderIPhone(IPHONE_15, STANDARD);
        System.out.println(iPhone1);
        System.out.println();

        IPhone iPhone2 = IPhoneSimpleFactory.orderIPhone(IPHONE_15, PLUS);
        System.out.println(iPhone2);
        System.out.println();

        IPhone iPhone3 = IPhoneSimpleFactory.orderIPhone(IPHONE_15, PRO);
        System.out.println(iPhone3);
        System.out.println();

        IPhone iPhone4 = IPhoneSimpleFactory.orderIPhone(IPHONE_15, PRO_MAX);
        System.out.println(iPhone4);
    }
}
