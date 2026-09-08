package com.codewithlei.rest_api;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.codewithlei.rest_api.StudentRequest.format;

@RestController
@RequestMapping("/demo")
public class controller {

    List<StudentRequest> list = new ArrayList<>();

    /*
       This adds a new StudentRequest object
       to the list, so basically POSTMAPPING is
       adding a new data in a database etc.
    */
    @PostMapping("/add-student")
    public String addStudent(@RequestBody StudentRequest request){
        list.add(request);
        return format(request);
    }
    /*
       This fetch or shows the current list of students
       so basically GetMapping gets the data.
    */
    @GetMapping("/show-student")
    public List<StudentRequest> viewStudent(){
        return list;
    }
}
