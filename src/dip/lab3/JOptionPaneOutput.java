/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author aschindler1
 */
public class JOptionPaneOutput implements Output{
    
    public JOptionPaneOutput(){
        
    }
    
    @Override
    public void GetOutput(String s) {
        JOptionPane.showMessageDialog(null, s);
    }
    
}
