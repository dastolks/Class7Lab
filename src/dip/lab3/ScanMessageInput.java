/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author aschindler1
 */
public class ScanMessageInput implements MessageInput{
    private String message;
    
    public ScanMessageInput(){
        message = "";
    }
    @Override
    public final String GetInput(){
        System.out.println("Enter your string: ");
        Scanner sc = new Scanner(System.in);
        message = sc.nextLine();
        return message;
    }
}
