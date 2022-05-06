/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import static bean.Config.users;
import bean.Teacher;
import bean.User;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import service.menu.interfac.MenuRegisterServiceInter;
import service.menu.interfac.MenuService;
import util.FileUtility;
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
//        User u_n = new User(username,gmail,password);
//        if(!users.stream().anyMatch(c -> u_n.username.equals(c.username))&& !users.stream().anyMatch(c -> u_n.gmail.equals(c.gmail))){  
//        users.add(u_n);
//        System.out.println(users);
////        Config.setRegistered(true);
//        FileUtility.writeObjectToFile(Config.instance(), "users.obj");
//       }
//        else {
//            Config.setRegistered(false);
//            throw new IllegalArgumentException("User already exist");
////            System.out.println(menus);
//        }
        boolean addUser = true;
        for (int i = 0; i < users.size(); i++) {
        if (users.get(i).getUsername().equals(username) || users.get(i).getGmail().equals(gmail)) {
            JOptionPane.showMessageDialog(null, "User exists in file");
            addUser = false;
        }
        else {
            JOptionPane.showMessageDialog(null, "User does not exist");
          
        }

    }
        if(addUser){
            User u_n = new User(username, gmail, password);
            users.add(u_n);
            System.out.println(users);
            saveUser();
        }
    }
   public void saveUser(){
 try {
        File filename = new File("users.obj");
        if (!filename.exists()) {
            filename.createNewFile();
        }


        FileWriter fw = new FileWriter(filename, false);
        BufferedWriter bw = new BufferedWriter(fw);
        for (User currUser : users){
        bw.write(currUser.toString());
        bw.newLine();
        }
        bw.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

}
    }



    
    
    
    

