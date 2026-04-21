public class Bomb extends Creature {
    // It's a bomb.

    // on turn 8,
    // does 100-200 damage to enemy and self
    private int charge = 7;


    @Override
    public float act() {
        if (charge == 0) {
            return attack();
        }
        charge();
        return 0;
    }


    public void charge() {
        charge -= 1;
        action = name;
    }

    // Returns the damage done by the Creature
    @Override
    public float attack() {


        float power = Rand.randomFloat(100, 200);
        action = name + " exploded!";

        // do damage to enemy and self
        health -= power;
        return power;

    }
}
