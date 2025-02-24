package com.flaviobarbosa.model;

public class IPhone15Plus extends IPhone {

  @Override
  public void getHardware() {
    System.out.println("IPhone 15 Plus hardware:");
    System.out.println("\t- 6.7-inch screen");
    System.out.println("\t- A16 Bionic");
    System.out.println("\t- 6GB RAM");
    System.out.println("\t- iOS 17");
  }
}
