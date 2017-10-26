package Effect;

import java.util.*;
import Entity.Fighter;

/**
 * 
 */
public abstract class Effect {

    /**
     * Default constructor
     */
    public Effect() {
    }




    /**
     * @param Fighter fighter
     */
    public abstract void apply(Fighter fighter);

}