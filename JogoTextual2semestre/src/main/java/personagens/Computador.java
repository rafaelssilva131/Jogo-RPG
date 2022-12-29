/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personagens;

import java.util.Random;

/**
 *
 * @author rafin
 */
public class Computador {
    private int hpPc;
    private int ataquePc;
    
    public Computador(){
        
    }
    public static int ataqueComputador(){
        Random input = new Random();
        return input.nextInt(3) + 1;
    }
    public int gethpPc(){
        return hpPc;
    }
    public void setHpPc(int hpPc){
        this.hpPc = hpPc;
    }
    public int getAtaquePc(){
        return ataquePc;
    }
    public void setAtaquePc(int ataquePc){
        this.ataquePc = ataquePc;
    }
}
