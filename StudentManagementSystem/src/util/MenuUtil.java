
package util;
        
import java.util.Scanner;

public class MenuUtil{
    public static Menu showMenu(){
        Menu.showALLMenu();
        System.out.println("Please select an option: ");
        Scanner sc = new Scanner(System.in);
        int selectedMenu = sc.nextInt();
        
        
       return Menu.find(selectedMenu);
    }
    public static void processMenu(Menu menu){
        menu.process();
    }
}
    

