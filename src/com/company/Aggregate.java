package com.company;
//aggregation happens when one or more object shares the the same object
//composition mein object is completely dependent on other object whereas aggregation mein partially on other object and partially on main function
public class Aggregate {
    public static void main(String[] args) {
        Professor prof=new Professor("shimona");
        Department cse=new Department();
        cse.getHOD(prof);
        Department ece=new Department();
        ece.getHOD(prof);
        System.out.println(cse.hod.name);
        System.out.println(ece.hod.name);
    }
}
class Professor{
    String name;
    Professor(String name)
    {
        this.name=name;
    }
}
class Department{
    Professor hod;
    void getHOD(Professor hod){
        this.hod=hod;
    }
}
