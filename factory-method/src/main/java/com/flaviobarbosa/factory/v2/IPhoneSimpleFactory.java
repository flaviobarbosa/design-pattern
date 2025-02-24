package com.flaviobarbosa.factory.v2;

import static com.flaviobarbosa.enums.Generation.IPHONE_15;
import static com.flaviobarbosa.enums.Level.PLUS;
import static com.flaviobarbosa.enums.Level.PRO;
import static com.flaviobarbosa.enums.Level.PRO_MAX;
import static com.flaviobarbosa.enums.Level.STANDARD;

import com.flaviobarbosa.enums.Generation;
import com.flaviobarbosa.enums.Level;
import com.flaviobarbosa.model.IPhone;
import com.flaviobarbosa.model.IPhone15;
import com.flaviobarbosa.model.IPhone15Plus;
import com.flaviobarbosa.model.IPhone15Pro;
import com.flaviobarbosa.model.IPhone15ProMax;

public class IPhoneSimpleFactory {

  public static IPhone orderIPhone(Generation generation, Level level) {
    IPhone device = null;

    if(IPHONE_15.equals(generation)) {
      if(STANDARD.equals(level)) {
        device = new IPhone15();
      } else if(PLUS.equals(level)) {
        device = new IPhone15Plus();
      } else if(PRO.equals(level)) {
        device = new IPhone15Pro();
      } else if(PRO_MAX.equals(level)) {
        device = new IPhone15ProMax();
      }
    }

    if(device != null) {
      device.getHardware();
      device.assemble();
      device.certificates();
      device.pack();
    }

    return device;
  }

}
