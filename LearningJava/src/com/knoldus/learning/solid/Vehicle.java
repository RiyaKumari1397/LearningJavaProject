package com.knoldus.learning.solid;

public class Vehicle {
    public void startEngine(){

    }

    public static void main(String [] a){

    }
}

class Car extends EngineVehicle{

}

class BiCycle extends NonEngineVehicle implements Bicycle_Interface{
    @Override
    public void startEngine() throws Exception{
            throw new Exception("Start Engine not supported");
        }
    }

