package com.example.demo.repository;

import com.example.demo.controller.ArrayInput;
import com.example.demo.modal.Course;
import com.example.demo.modal.Instructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class CourseRepository {
    List<Course> courses = new ArrayList<>();

    // constructor
    public CourseRepository() {
        Course javaOne = Course.builder()
                .className("Java I")
                .instructor(new Instructor("Steve", "Jobs", "Phd", "TownHall201"))
                .startDate(new Date("8/1/2018"))
                .endDate(new Date("12/24/2018"))
                .timeFrame("8am-10am")
                .build();
        Course two= Course.builder()
                .className("Java II")
                .instructor(new Instructor("Steve", "Jobs", "Phd", "TownHall201"))
                .startDate(new Date("8/1/2018"))
                .endDate(new Date("12/24/2018"))
                .timeFrame("8am-10am")
                .build();
        courses.add(javaOne);
        courses.add(two);


    }


    public List<Course> findAllClasses(){
        //链接数据库
        //返回数据库的信息
        return  courses;
    }

    public List<Course> findAllCourse(String searchByCourseName){

        return new ArrayList<Course>();
    }

    public List<Course> findCourseByName(String courseName) {
        if(courseName.equals("Java_I")) {
            return courses;
        }

        return new ArrayList<Course>();
    }

    public int[] returnTwoSum(int target) {
        int[] nums = {1, 3, 5, 17};
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return new int[]{l, r};
            }
            if (sum < target) {
                l++;
            }
            if (sum > target) {
                r --;
            }
        }

        return new int[]{-1, -1};
    }

    public int[] returnTwoSum2(ArrayInput arrayInput) {
        int l = 0, r = arrayInput.nums.size() - 1;
        while (l < r) {
            int sum = arrayInput.nums.get(l) + arrayInput.nums.get(r);
            if (sum == arrayInput.target) {
                return new int[]{l, r};
            }
            if (sum < arrayInput.target) {
                l++;
            }
            if (sum > arrayInput.target) {
                r--;
            }
        }

        return new int[]{-1, -1};
    }
}
