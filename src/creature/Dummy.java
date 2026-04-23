// Dummy
// Does not do anything, usually.

// 1% chance to deal 999 damage because why not

package creature;

import logic.Creature;
import util.Rand;

public class Dummy extends Creature {

    public Dummy() {
        super("Dummy");
    }



    // dummies can't attack, dummy
    @Override
    public float act() {
        if (Rand.randomFloat(0, 100) < 1) {
            return attack();
        }
        idle();
        return 0;
    }


    public void idle() {
        action = name + " can't attack, dummy.";
    }

    @Override
    public float attack() {
        action = "When will you learn?";
        return 999;

    }

    // dummies can't defend, dummy
    @Override
    public void defend(float incomingPower) {
        action = name + " does not seem to notice.";
        health -= incomingPower;
    }
}
