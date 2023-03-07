/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.peerplan;

import swing.LogIn;
import javax.swing.UIManager;
import swing.Home;


/**
 *
 * @author allen
 */
public class PeerPlan {

    public static void main(String[] args) throws Exception {
        String str = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        UIManager.setLookAndFeel(str);
        
        System.out.println("HELLO WORLD!");
        new LogIn().setVisible(true);
    }
}
