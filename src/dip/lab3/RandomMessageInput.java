/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Random;

/**
 *
 * @author aschindler1
 */
public class RandomMessageInput implements MessageInput {
    private String[] randomMessage = {
        "Howdy howdy how are you?",
        "I can't believe I ate the whole thing!",
        "What time is it?",
        "I hope you're having a good day!",
        "MY HAIR IS ON FIRE!"
    };
    private int messageAt;
    
    public RandomMessageInput(){
        
    }
    @Override
    public final String GetInput(){
        Random ran = new Random();
        messageAt = ran.nextInt(4);
        return randomMessage[messageAt];
    }
}
