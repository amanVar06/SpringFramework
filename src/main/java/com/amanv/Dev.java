package com.amanv;

public class Dev {

//    private Laptop laptop;
    private Computer computer;
//    private int age;

    public Dev() {
        System.out.println("Dev constructor..");
    }

//    public Dev(int age) {
//        this.age = age;
//        System.out.println("Dev parameterized constructor..");
//    }

//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//        System.out.println("Dev parameterized laptop constructor..");
//    }

//    public Computer getComputer() {
//        return computer;
//    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build() {
//        laptop.compile();
        computer.compile();
        System.out.println("Welcome to MyApp!");
    }
}
