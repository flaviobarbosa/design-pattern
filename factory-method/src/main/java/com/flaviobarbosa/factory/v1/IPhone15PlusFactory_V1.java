package com.flaviobarbosa.factory.v1;

import com.flaviobarbosa.model.IPhone;
import com.flaviobarbosa.model.IPhone15Plus;

public class IPhone15PlusFactory_V1 extends IPhoneFactory_V1 {

  @Override
  protected IPhone createIPhone() {
    return new IPhone15Plus();
  }
}
