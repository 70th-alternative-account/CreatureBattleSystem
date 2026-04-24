package logic;

import util.Rand;

public class Creature {

//    protected float health;
//    protected String name;
//    protected String action;

    private final String name;
    private String action;

    private float health;


    public Creature(String name, float health) {
        this.name = name;
        this.health = health;
    }

    public Creature() {
        this("Creature", 100);
    }



    public float act() {
        float power = this.attack();
        this.readAction();
        return power;
    }

    public void react(float incomingPower) {
        incomingPower = defend(incomingPower);
        this.readAction();
        damage(incomingPower);
        this.readAction();
    }

    public void damage(float incomingPower) {
        health -= incomingPower;
        action = name + " lost " + incomingPower + " health.";
    }

    public boolean alive() {
        return health > 0;
    }



    // Returns the damage done by the Creature
    public float attack() {

        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 10-20
        float power = Rand.randomFloat(10, 20);
        action = name + " attacked! (" + power + ")";
        return power;
    }

    public float defend(float incomingPower) {

        // 10 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 1) {
            incomingPower = incomingPower * 0.8f;
            action = name + " defended and reduced damage taken by 10%! (" + incomingPower + ")";
        }
        else
        {
            action = name + " did not defend.";
        }
        return incomingPower;
    }

    public void readAction() {
        System.out.println(action);
    }

    @Override
    public String toString() {
        return getClass() + "{name: " + name + ", health: " + health + "}";
    }
}
