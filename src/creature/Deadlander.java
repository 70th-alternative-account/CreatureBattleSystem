package creature;

import logic.Creature;
import util.Rand;

public class Deadlander extends Creature {
    // Changed chance of missing from 20% to 50%
    // Damage between 16-32


    // Returns the damage done by the Creature
    @Override
    public float attack() {

        // 50% chance of missing
        if (Rand.randomInt(0, 10) < 5) {
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 16-32
        float power = Rand.randomFloat(16, 32);
        action = name + " attacked with power " + power + "!";
        return power;
    }
}
