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
public class StartUp {
    public static void main(String[] args) {
        MessageInput mi = new ScanMessageInput();
        Output op = new JOptionPaneOutput();
        InputOutputManager manager = new InputOutputManager(mi, op);
        manager.getMessage();
    }
}