package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author： lxh
 * @description：
 * @created: 2018/6/5 10:22
 * @modified by:
 */
@RestController
@RequestMapping("/datasource")
public class DataSourceController {

    @GetMapping("/getmap")
    public Map getMap(){
        Map<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("Star Wars: A New Hope","1977");
        stringStringHashMap.put("Star Wars: The Empire Strikes Back","1980");
        stringStringHashMap.put("Star Wars: Return of the Jedi","1983");
        Map<String, Map> map = new HashMap<>();
        map.put("results",stringStringHashMap);
        return map;
    }


    @GetMapping("/getlist")
    public List getList(){
        List<Person> list= new ArrayList<>();
        list.add(new Person("Joe Smith",2000));
        list.add(new Person("Jane Smith",2250));
        list.add(new Person("Will Roberts",1550));
        return list;
    }

    public class Person{
        private String employee;
        private Integer sales;

        public Person() {
        }

        public Person(String employee, Integer sales) {
            this.employee = employee;
            this.sales = sales;
        }

        public String getEmployee() {
            return employee;
        }

        public void setEmployee(String employee) {
            this.employee = employee;
        }

        public Integer getSales() {
            return sales;
        }

        public void setSales(Integer sales) {
            this.sales = sales;
        }
    }
}
