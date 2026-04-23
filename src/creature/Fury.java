// when below half hp:
// 1.5x atk multiplier
// fury also takes 20% of that damage itself, after multiplier

package creature;

import logic.Creature;
import util.Rand;

public class Fury extends Creature {

    public Fury() {
        super("Fury");
    }



    public float attack() {

        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 10-20

        float power = Rand.randomFloat(10, 20);
        action = name + " attacked with power " + power + "!";
        if (health < 50) {
            power *= 1.5f;
            float rebound = power * 0.2f;
            health -= rebound;
            action = name + " struck wildly with power " + power + ", taking " + rebound + " damage itself!";
        }

        return power;
    }
}
