package com.algorhythm.easy.list;

import java.util.HashMap;
import java.util.Map;

public class ParkingSystem {
  public static void main(String[] args) {
    ParkingSystem ps = new ParkingSystem(1,1,0);
    System.out.println(ps.addCar(1));
    System.out.println(ps.addCar(2));
    System.out.println(ps.addCar(3));
    System.out.println(ps.addCar(1));
  }
  Map<Integer, Boolean[]> parking;
  Map<Integer, Integer> fillStatus;
  public ParkingSystem(int big, int medium, int small) {
    parking = new HashMap<>();
    parking.put(1, new Boolean[big]);
    parking.put(2, new Boolean[medium]);
    parking.put(3, new Boolean[small]);
    fillStatus = new HashMap<>();
    fillStatus.put(1, 0);
    fillStatus.put(2, 0);
    fillStatus.put(3, 0);
  }

  public boolean addCar(int carType) {
    try {
      parking.get(carType)[fillStatus.get(carType)] = true;
      fillStatus.put(carType, fillStatus.get(carType)+1);
      return true;
    }catch (ArrayIndexOutOfBoundsException e) {
      return false;
    }
  }
}
