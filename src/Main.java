import logic.BattleSystem;
import logic.Creature;

public class Main {

    public static void main(String[] args) {

        // set up the creatures
        Creature a = new Creature();
        Creature b = new Creature();

//        Creature a = BattleSystem.genCreature();
//        Creature b = BattleSystem.genCreature();

        // run the battle
        BattleSystem.battle(a, b);
    }
}
