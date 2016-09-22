/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author aschindler1
 */
public class ConsoleOutput implements Output{

    public ConsoleOutput(){
        
    }
    
    @Override
    public final void GetOutput(String s) {
        System.out.println(s);
    }
    
    
}
