/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import service.menu.interfac.MenuAddStudentServiceInter;

/**
 *
 * @author Ayxan
 */
public class MenuAddStudentService implements MenuAddStudentServiceInter {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("name:");
        String name =sc.next();
        sc = new Scanner(System.in);
        System.out.println("surname:");
        String surname =sc.next();
        
        
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        
        Config.instance().setStudents(s);
    }
    
}
