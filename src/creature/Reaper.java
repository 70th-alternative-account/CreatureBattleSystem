package creature;

import logic.Creature;
import util.Rand;

public class Reaper extends Creature {
    // zero miss chance
    // atk increased from 10-20 to 15-45
    // zero defend chance
    private int charge = 1;


    @Override
    public float act() {
        if (charge == 0) {
            charge = 1;
            return attack();
        }
        charge();
        return 0;
    }


    public void charge() {
        charge -= 1;
        action = name + " waits patiently.";
    }

    // Returns the damage done by the Creature
    @Override
    public float attack() {

        // do damage
        float power = Rand.randomFloat(15, 45);
        action = name + " struck hard with power " + power + "!";
        return power;

    }

    @Override
    public void defend(float incomingPower) {
        action = name + " did not defend.";
        health -= incomingPower;
    }
}
