import logic.BattleSystem;
import logic.Creature;

public class Main {

    public static void main(String[] args) {

        // set up the creatures
//        Creature a = new Creature();
//        a.name = String.valueOf(a.getClass());
//        a.health = 100;
//        Creature b = new Creature();
//        b.name = String.valueOf(b.getClass());
//        b.health = 100;

        Creature a = BattleSystem.genCreature();
        Creature b = BattleSystem.genCreature();

        // run the battle
        BattleSystem.battle(a, b);
    }
}
