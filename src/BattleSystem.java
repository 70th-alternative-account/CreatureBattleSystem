public class BattleSystem {
    public void battle(Creature a, Creature b) {
        while (a.health > 0 && b.health > 0) {
            float attackPower = a.attack();
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

    public static Creature genCreature(boolean random) {
        Creature c;
        int id;

        if (random) {
            id = Rand.randomInt(0, 7);
        }
        else {
            id = 0;
            // remind me later
        }

        System.out.println(id);

        switch (id) {

            case 1:
                c = new Deadlander();
                break;
            case 2:
                c = new Dummy();
                break;
            case 3:
                c = new ArmouredCreature();
                break;
            case 4:
                c = new GlassCannon();
                break;
            case 5:
                c = new Reaper();
                break;
            case 6:
                c = new Fury();
                break;
            default:
                c = new Creature();
        }

        c.name = String.valueOf(c.getClass());
        c.health = 100;

        return c;
    }
}
