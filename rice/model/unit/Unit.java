/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rice.model.unit;

import rice.model.Controllable;
import rice.view.ViewableUnit;

/**
 *
 * @author Marcos
 */
public abstract class Unit extends Controllable implements ViewableUnit {

     public int getHealth() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getSpeed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getArmor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getAttack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getDefense() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getStatus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getID() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}