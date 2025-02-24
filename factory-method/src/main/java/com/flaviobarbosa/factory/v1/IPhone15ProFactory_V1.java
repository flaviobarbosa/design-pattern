package com.flaviobarbosa.factory.v1;

import com.flaviobarbosa.model.IPhone;
import com.flaviobarbosa.model.IPhone15Pro;

public class IPhone15ProFactory_V1 extends IPhoneFactory_V1 {

  @Override
  protected IPhone createIPhone() {
    return new IPhone15Pro();
  }
}
