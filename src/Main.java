public class Main {

    public static void main(String[] args) {

        // set up the creatures
        //Creature a = new Creature();
        //Creature b = new Creature();
        Creature a = BattleSystem.genCreature(true);
        Creature b = BattleSystem.genCreature(true);

        // run the battle
        BattleSystem.battle(a, b);
    }
}
