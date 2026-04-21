public class Everlasting extends Creature {
    // heal() action
    // when able to, 50% chance to heal 10-30 HP instead of attacking
    // locked for 2 turns after every use


    private int cooldown = 2;


    @Override
    public float act() {
        if (cooldown <= 0) {
            if (Rand.randomInt(0, 2) == 0) {
                cooldown = 2;
                heal();
                return 0;
            }
        }

        cooldown -= 1;
        return this.attack();
        // beautiful code i know
    }

    public void heal() {
        float power = Rand.randomFloat(10, 30);
        action = name + " recovered " + power + " HP!";
        health += power;
    }


    @Override
    public float attack() {

        // 0% chance of missing

        // otherwise, do damage between 8-16
        float power = Rand.randomFloat(8, 16);
        action = name + " attacked with power " + power + "!";
        return power;
    }

    @Override
    public void defend(float incomingPower) {

        // 0 % chance of reducing damage taken
        action = name + " did not defend.";

        health -= incomingPower;
    }

}
