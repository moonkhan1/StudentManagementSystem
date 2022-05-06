/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import service.menu.interfac.MenuService;

/**
 *
 * @author Ayxan
 */
public class MenuExitService implements MenuService {
    @Override
    public void process() {
        System.exit(0);
    }  
}
