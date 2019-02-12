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
public class ShooterClassAdapter extends Warrior implements IShooter{

    @Override
    public void incHealth() {
        super.addHealth(1);
    }

    @Override
    public void decHealth() {
        super.subHealth(1);
    }
    
}
