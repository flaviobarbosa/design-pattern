package com.flaviobarbosa.factory.v1;

import com.flaviobarbosa.model.IPhone;
import com.flaviobarbosa.model.IPhone15;

public class IPhone15Factory_V1 extends IPhoneFactory_V1 {

  @Override
  protected IPhone createIPhone() {
    return new IPhone15();
  }
}
