public class GlassCannon extends Creature {
    // damage increased from 10-20 to 32-64
    // defend chance increased from 10% to 20%
    // receives 4x more damage when not defending


    // Returns the damage done by the Creature
    public float attack() {

        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 10-20
        float power = Rand.randomFloat(32, 64);
        action = name + " attacked with power " + power + "!";
        return power;
    }

    public void defend(float incomingPower) {

        // 20 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 2) {
            incomingPower = incomingPower * 0.8f;
            action = name + " defended and reduced damage taken to " + incomingPower;
        }
        else
        {
            incomingPower *= 4f;
            action = name + " was defenseless, taking " + incomingPower + " damage!";
        }

        health -= incomingPower;
    }
}
