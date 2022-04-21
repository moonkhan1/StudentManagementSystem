/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

public class Person {
    private String name;
    private String surname;
    private int age;
    
    //bos konstruktor(default saxlayiriq ki, Personun obyekti yaradila bilmesin, cunki ehtiyac yoxdur. 
    // Private versek construktoru olmayan ve Person'u extends eden classlar onu cagira bilmeyecek )
    Person(){
        
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}

