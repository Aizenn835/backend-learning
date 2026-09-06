package com.codewithlei.dependency_injection;


import org.springframework.stereotype.Service;

@Service
public class CarService {
    Car car = new Car("Blue" , "Mitsubishi 2026" , "Montero");

    public String carModel(){

        return "Car model: " + car.getName() + "\n" +
               "Car model: " + car.getModel() + "\n" +
               "Car color: " + car.getColor() + "\n";
    }
}
