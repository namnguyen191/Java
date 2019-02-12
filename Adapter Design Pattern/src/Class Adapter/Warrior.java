/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C;

/**
 *
 * @author Nam Nam
 */
public class Warrior {
    private int health = 100;
    public void addHealth(int amt){
        this.health+=amt;
    }
    public void subHealth(int amt){
        this.health-=amt;
    }
    public int getHealth(){
        return this.health;
    }
}
