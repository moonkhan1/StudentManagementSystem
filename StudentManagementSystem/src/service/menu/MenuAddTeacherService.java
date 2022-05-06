/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import java.util.Scanner;
import service.menu.interfac.MenuAddTeacherServiceInter;
import util.FileUtility;

/**
 *
 * @author Ayxan
 */
public class MenuAddTeacherService implements MenuAddTeacherServiceInter{

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("name:");
        String name =sc.next();
        sc = new Scanner(System.in);
        System.out.println("surname:");
        String surname =sc.next();
        sc = new Scanner(System.in);
        System.out.println("School name:");
        String schoolName =sc.next();
        sc = new Scanner(System.in);
        System.out.println("Salary:");
        String salary =sc.next();
        
        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);
        t.setSurname(schoolName);
        t.setSurname(salary);
        
        Config.instance().setTeachers(t);
        FileUtility.writeObjectToFile(Config.instance(), "app.obj");
        
    }
    
}
