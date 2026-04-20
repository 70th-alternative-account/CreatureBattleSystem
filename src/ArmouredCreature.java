public class ArmouredCreature extends Creature {
    // Miss chance increased from 20% to 30%
    // Damage decreased from 10-20 to 8-16
    // Defend chance increased from 10% to 80%


    public float attack() {

        // 30% chance of missing
        if (Rand.randomInt(0, 10) < 3) {
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 8-16
        float power = Rand.randomFloat(8, 16);
        action = name + " attacked with power " + power + "!";
        return power;
    }


    public void defend(float incomingPower) {

        // 80 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 8) {
            incomingPower = incomingPower * 0.8f;
            action = name + " defended and reduced damage taken to " + incomingPower;
        }
        else
        {
            action = name + " did not defend.";
        }

        health -= incomingPower;
    }
}
