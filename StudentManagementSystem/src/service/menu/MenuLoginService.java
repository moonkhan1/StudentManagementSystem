/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import static bean.Config.users;
import java.util.Scanner;
import service.menu.interfac.MenuLoginServiceInter;

/**
 *
 * @author Ayxan
 */
public class MenuLoginService implements MenuLoginServiceInter{

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("username:");
        String username =sc.next();
        sc = new Scanner(System.in);
        System.out.println("password:");
        String password =sc.next();
        
        
//        if ((!username.equals("ayxan")&&password.equals("1234"))){
//            throw new IllegalArgumentException("Username or password is invalid");
//        }
        if(users.stream().anyMatch(u_n -> username.equals(u_n.username))&& users.stream().anyMatch(u_n -> password.equals(u_n.password))){
        Config.setLoggedIn(true); // Eger isdifadeci melumatlari duzgun daxil edibse true versin
        }
        else{
            throw new IllegalArgumentException("Username or password is invalid");
        }
        }
    
    
}
