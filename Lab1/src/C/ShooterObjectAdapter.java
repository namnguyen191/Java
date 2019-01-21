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
public class ShooterObjectAdapter implements IShooter{
    Warrior warrior = new Warrior();

    @Override
    public void incHealth() {
        this.warrior.addHealth(1);
    }

    @Override
    public void decHealth() {
        this.warrior.subHealth(1);
    }

    @Override
    public int getHealth() {
        return this.warrior.getHealth();
    }
    
    
}
