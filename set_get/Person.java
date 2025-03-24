package javacollege;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class Person {

    private String name;//private instance variable
    private int age;

    Person() {
        this.name = "";
        this.age = 0;
    }

    void setInfo(String name) {
        this.name = name;
    }

    String getInfo() {
        return name;
    }

    void setAge(int age) {
        this.age = age;

    }

    int getAge() {
        return age;
    }
}
