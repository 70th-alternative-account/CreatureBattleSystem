public class Reaper extends Creature {
    // zero miss chance
    // atk increased from 10-20 to 15-45
    // zero defend chance
    private int cooldown = 1;


    // Returns the damage done by the Creature
    public float attack() {

        if(cooldown > 0) {
            // update timer
            cooldown -= 1;
        }
        
        else {
            // reset cooldown
            cooldown = 1;

            // otherwise, do damage between 20-50
            float power = Rand.randomFloat(20, 50);
            action = name + " attacked with power " + power + "!";
            return power;
        }
    }

    public void defend(float incomingPower) {
        action = name + " did not defend.";
        health -= incomingPower;
    }
}
