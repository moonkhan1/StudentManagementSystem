/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import bean.User;
import service.menu.interfac.MenuRegisterServiceInter;

/**
 *
 * @author Ayxan
 */
public class MenuShowUsersService implements MenuRegisterServiceInter{

    @Override
    public void process() {
        User[] alluser = Config.instance().getUser();
        for (int i = 0; i < alluser.length; i++) {
            System.out.println(alluser[i]);
        }
    }
    
}
