public class Dummy extends Creature {
    // Can no longer attack
    // Can no longer defend


    // dummies can't attack, dummy
    @Override
    public float attack() {

        action = name + " is a dummy.";
        return 0;

    }

    // dummies can't defend, dummy
    @Override
    public void defend(float incomingPower) {
        action = name + " does not seem to notice.";
        health -= incomingPower;
    }
}
