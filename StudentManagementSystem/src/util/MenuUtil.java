
package util;
        
import java.util.Scanner;

public class MenuUtil{
    public static void showMenu(){
        System.out.println("Please select an option: ");
        Menu.showALLMenu();
        Scanner sc = new Scanner(System.in);
        int selectedMenuNumber = sc.nextInt();
        
        
       Menu selectedMenu = Menu.find(selectedMenuNumber);
       selectedMenu.process();
    }
}
    

