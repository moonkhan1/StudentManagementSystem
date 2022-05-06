/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import util.FileUtility;

// Serializable = Fayla yazila bilme
public class Config implements Serializable{
    private static boolean loggedIn; // Isdifadecinin logged in olub olmamasini yoxlayiriq
    private static boolean registered; 
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<User> users = new ArrayList<>();
    public static  Config config = null; // Config classini diger classlardan cagirmaq ucun

    
    public static void initilize(){
        Object obj = FileUtility.readObjectFromFile("app.obj");
        Object obj2 = FileUtility.readObjectFromFile("users.obj");
        if(obj == null || obj2 == null){
            return;
    }
        if(obj instanceof Config || obj2 instanceof Config){
            config = (Config)obj;
        }
    }
    public Teacher[] getTeachers() {
       Teacher[] t = new Teacher[teachers.size()];
        for(int i = 0; i< t.length;i++){
            t[i] = teachers.get(i);
        }
        if(t.length == 0){
            System.out.println("No teacher is enrolled");
        }
        return t;
    }

    public void setTeachers(Teacher teachers) {
        this.teachers.add(teachers);
    }

    public Student[] getStudents() {
        Student[] s = new Student[students.size()];
        for(int i = 0; i< s.length;i++){
            s[i] = students.get(i);
        }
        if(s.length == 0){
            System.out.println("No student is enrolled");
        }
        return s;
    }

    public void setStudents(Student students) {
        this.students.add(students);
    }
    
    public User[] getUser() {
        User[] u = new User[users.size()];
        for(int i = 0; i< u.length;i++){
            u[i] = users.get(i);
        }
        if(u.length == 0){
            System.out.println("No user is registered");
        }
        return u;
    }

    public void setUser(User users) {
        this.users.add(users);
    }
    
    
    public static Config instance(){
        if(config == null){
            config = new Config();
        }
        return config;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }
    
    public static boolean isRegistered() {
        return registered;
    }

    public static void setRegistered(boolean registered) {
        Config.registered= registered;
    }
}
