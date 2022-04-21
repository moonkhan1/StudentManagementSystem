
package main;

import util.Menu;
import util.MenuUtil;

public class Main {


    public static void main(String[] args) {
       Menu m = MenuUtil.showMenu();
       MenuUtil.processMenu(m);
    }
    
}
 