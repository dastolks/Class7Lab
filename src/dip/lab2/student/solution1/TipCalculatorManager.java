package dip.lab2.student.solution1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alec
 */
public class TipCalculatorManager {
    private TipCalculator tipCalculator;
    
    public TipCalculatorManager(TipCalculator t){
        this.tipCalculator = t;
    }

    public final double retrieveTip(){
        return tipCalculator.getTip();
    
    }
    
    public TipCalculator getTipCacluator() {
        return tipCalculator;
    }

    public void setTipCacluator(TipCalculator tipCacluator) {
        this.tipCalculator = tipCacluator;
    }
    
    
    
}
