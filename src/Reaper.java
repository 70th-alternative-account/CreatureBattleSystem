public class Reaper extends Creature {
    // zero miss chance
    // atk increased from 10-20 to 15-45
    // zero defend chance
    private int charge = 1;


    // Returns the damage done by the Creature
    @Override
    public float attack() {

        if (charge == 0) {

            charge = 1;

            // do damage
            float power = Rand.randomFloat(15, 45);
            action = name + " struck hard with power " + power + "!";
            return power;
        }

        charge -= 1;
        action = name + " waits patiently.";
        return 0;

    }

    @Override
    public void defend(float incomingPower) {
        action = name + " did not defend.";
        health -= incomingPower;
    }
}
