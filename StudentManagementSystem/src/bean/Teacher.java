/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author Ayxan
 */
public class Teacher extends Person{
    private String schoolName;
    private double salary;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teachers:" + ", Name" + getName() + ", Sutname"+ getSurname() + ", schoolName=" + schoolName + ", salary=" + salary + '}';
    }


}
