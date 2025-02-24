package com.flaviobarbosa.model;

public class IPhone15 extends IPhone {

  @Override
  public void getHardware() {
    System.out.println("IPhone 15 hardware:");
    System.out.println("\t- 6.1-inch screen");
    System.out.println("\t- A16 Bionic");
    System.out.println("\t- 6GB RAM");
    System.out.println("\t- iOS 17");
  }
}
