package com.example.demo.service;


import com.example.demo.controller.ArrayInput;
import com.example.demo.modal.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> findAllCourses(){

        return courseRepository.findAllClasses();
    }

    public List<Course> searchByCourseName(String input){

        return courseRepository.findCourseByName(input);
    }

    public int[] findTwoSum1(int intput){

        return courseRepository.returnTwoSum(intput);
    }

    public int[] findTwoSum2(ArrayInput arrayInput) {

        return courseRepository.returnTwoSum2(arrayInput);
    }

}
