package com.flaviobarbosa.factory.v1;

import com.flaviobarbosa.model.IPhone;
import com.flaviobarbosa.model.IPhone15ProMax;

public class IPhone15ProMaxFactory_V1 extends IPhoneFactory_V1 {

  @Override
  protected IPhone createIPhone() {
    return new IPhone15ProMax();
  }
}
