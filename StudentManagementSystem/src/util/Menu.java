
package util;

import service.menu.MenuLoginService;
import service.menu.interfac.MenuService;
import service.menu.MenuRegisterService;
public enum Menu {
    LOGIN(1,"Login", new MenuLoginService()), // Bunlarinda her biri MenuUtilin subclassidir 
    REGISTER(2,"Register", new MenuRegisterService()),
    ADD_TEACHER(3,"Add teacher", null),
    ADD_STUDENT(4,"Add student", null),
    SHOW_ALL_STUDENT(5,"Show students",null),
    SHOW_ALL_TEACHERS(6,"Show students",null),
    UNKNOWN;
    


    private String label;
    private MenuService service;
    private int number;
    // UNKNOWN'un constructoru
    private Menu(){
    
    }

    // UNKNOWN'dan basqa subclasslarin constructoru
    private Menu(int number, String label, MenuService service){
        this.label =label;
        this.service = service;
        this.number = number;
    }

    public String getLabel(){
        return label;
    }

        
    // Bize subclasslarin adini yox, constructorlarin icine yazilanlari qaytarsin
    @Override
    public String toString() {
        return number + "." + label;
    }
    
    public void process(){
     service.process(); // Yuxarida hansi tip servis secilerse, onun prosesini cagiracaq
    }

    public int getNumber() {
        return number;
    }
    
    public static Menu find(int number){
        Menu menus[] = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if(menus[i].getNumber() == number){
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }
    public static void showALLMenu(){
        Menu menus[] = Menu.values(); // Menu nun qiymetlerini bir arrayda qaytarir
        for (int i = 0; i < menus.length; i++) {
            if(menus[i]!=UNKNOWN)
            System.out.println(menus[i]);
        }
    }
}