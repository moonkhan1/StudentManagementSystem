/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import service.menu.interfac.MenuShowTeacherServiceInter;

/**
 *
 * @author Ayxan
 */
public class MenuShowTeacherService implements MenuShowTeacherServiceInter{

    @Override
    public void process() {
        Teacher[] allteacher = Config.instance().getTeachers();
        for (int i = 0; i < allteacher.length; i++) {
            System.out.println(allteacher[i]);
        }
    }
    
}
