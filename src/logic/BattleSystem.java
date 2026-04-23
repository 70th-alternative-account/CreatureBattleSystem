package logic;

import util.Rand;
import creature.*;

public class BattleSystem {
    public static void battle(Creature a, Creature b) {
        while (a.health > 0 && b.health > 0) {
            float attackPower = a.act();
            b.defend(attackPower);
            System.out.println(a.readAction());
            System.out.println(b.readAction());

            System.out.println(a);
            System.out.println(b);
            System.out.println();

            // swap turns
            Creature temp = a;
            a = b;
            b = temp;
        }
    }

    public static Creature genCreature() {
        Creature c;
        int id;

        id = Rand.randomInt(0, 9);



        // awesome code
        c = switch (id) {
            case 1 -> new Deadlander();
            case 2 -> new Dummy();
            case 3 -> new ArmouredCreature();
            case 4 -> new GlassCannon();
            case 5 -> new Reaper();
            case 6 -> new Fury();
            case 7 -> new Everlasting();
            case 8 -> new Bomb();
            default -> new Creature();
        };

        c.name = String.valueOf(c.getClass());
        c.health = 100;

        return c;
    }
}
