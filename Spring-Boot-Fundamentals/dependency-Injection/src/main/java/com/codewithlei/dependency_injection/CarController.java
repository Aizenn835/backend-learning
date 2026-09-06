package com.codewithlei.dependency_injection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {
    private final CarService carService;

    // Dependency Injection:
    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/view-specification")
    public String getSpecs(){
        return carService.carModel();
    }
}
