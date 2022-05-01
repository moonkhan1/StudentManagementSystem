/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import static bean.Config.users;
import bean.Teacher;
import bean.User;
import java.util.Scanner;
import service.menu.interfac.MenuRegisterServiceInter;
import service.menu.interfac.MenuService;
import util.MenuUtil;

/**
 *
 * @author Ayxan
 */
public class MenuRegisterService implements MenuRegisterServiceInter{

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("name:");
        String name =sc.next();
        sc = new Scanner(System.in);
        System.out.println("surname:");
        String surname =sc.next();
        sc = new Scanner(System.in);
        System.out.println("age:");
        int age =sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("username:");
        String username =sc.next();
        sc = new Scanner(System.in);
        System.out.println("gmail:");
        String gmail =sc.next();
        sc = new Scanner(System.in);
        System.out.println("password:");
        String password =sc.next();
        User u_n = new User(username,gmail,password);
        if(!users.stream().anyMatch(c -> u_n.username.equals(c.username))&& !users.stream().anyMatch(c -> u_n.gmail.equals(c.gmail))){  
        users.add(u_n);
        System.out.println(users);
//        Config.setRegistered(true);
       }
        else {
            Config.setRegistered(false);
            throw new IllegalArgumentException("User already exist");
//            System.out.println(menus);
        }

    }   
    }
    
    
    
    

