public class Fury extends Creature{
    // when below half hp:
    // atk does 50% more dmg
    // fury also takes 20% of that damage itself


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
            action = name + " attacked wildly with power " + power + ", taking " + rebound + " damage itself!";
        }

        return power;
    }
}
