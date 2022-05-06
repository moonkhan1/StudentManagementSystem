/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import service.menu.interfac.MenuAddStudentServiceInter;
import util.FileUtility;

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
        sc = new Scanner(System.in);
        System.out.println("School name:");
        String schoolName =sc.next();
        sc = new Scanner(System.in);
        System.out.println("Scholarship:");
        String scholar =sc.next();
        
        
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
         s.setSurname(schoolName);
          s.setSurname(scholar);
        
        Config.instance().setStudents(s);
        FileUtility.writeObjectToFile(Config.instance(), "app.obj");
    }
    
    
}
