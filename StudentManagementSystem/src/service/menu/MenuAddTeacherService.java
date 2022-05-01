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
        
        
        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);
        
        Config.instance().setTeachers(t);
    }
    
}
