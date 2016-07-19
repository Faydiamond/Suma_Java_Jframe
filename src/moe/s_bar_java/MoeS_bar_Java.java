/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.s_bar_java;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class MoeS_bar_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Age=JOptionPane.showInputDialog("Por favor digita tu edad:");
        int Ag=Integer.parseInt(Age);
        if(Ag <21)
        {
            JOptionPane.showMessageDialog(null,"i´m sorry but you can not follow");
        }else{
            JOptionPane.showMessageDialog(null,"Welcome to the moe´s bar, you take  a drink is courtesy of the house ");
        }
    }
    
}
