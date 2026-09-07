package com.codewithlei.exception_handling;

import com.codewithlei.exception_handling.exception.ProductNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<String> list = new ArrayList<>();

    public void populateList(){
        list.add("Iphone 11");
        list.add("Smart TV");
        list.add("Electric Fan");
    }

    // This throws a ProductNotFoundException which is a custom exception if the list is empty.
    public void getList(){
        if(list.isEmpty()){
            throw new ProductNotFoundException();
        }
        list.forEach(System.out::println);
    }
}
