package com.flaviobarbosa.model;

public class IPhone15Pro extends IPhone {

  @Override
  public void getHardware() {
    System.out.println("IPhone 15 Pro hardware:");
    System.out.println("\t- 6.1-inch screen");
    System.out.println("\t- A17 Pro");
    System.out.println("\t- 8GB RAM");
    System.out.println("\t- iOS 17");
  }
}
