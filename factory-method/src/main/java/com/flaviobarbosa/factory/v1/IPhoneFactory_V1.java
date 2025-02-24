package com.flaviobarbosa.factory.v1;

import com.flaviobarbosa.model.IPhone;

public abstract class IPhoneFactory_V1 {

  public IPhone orderIPhone() {
    IPhone device = null;

    device = createIPhone();

    device.getHardware();
    device.assemble();
    device.certificates();
    device.pack();

    return device;
  }

  protected abstract IPhone createIPhone();

}
