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
public class InputOutputManager {
    private MessageInput mi;
    private Output op;
    
    public InputOutputManager(MessageInput m, Output o){
        mi = m;
        op = o;
    }
    
    public void getMessage(){
        op.GetOutput(mi.GetInput());
    }
    
}
