public class Dummy extends Creature {
    // Can no longer attack
    // Can no longer defend


    // dummies can't attack, dummy
    @Override
    public float attack() {

        action = name + "       !";
        return 0;

    }

    // dummies can't defend, dummy
    @Override
    public void defend(float incomingPower) {
        action = name + " did not defend.";
        health -= incomingPower;
    }
}
