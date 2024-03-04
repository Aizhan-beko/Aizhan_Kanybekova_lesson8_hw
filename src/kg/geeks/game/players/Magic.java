package kg.geeks.game.players;

public class Magic extends Hero {
    public Magic(int health, int damage, String name, int booster) {
        super(health, damage, SuperAbility.BOOST, name);
        this.booster = booster;
    }

    private int booster = 10;

    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i]) {
                heroes[i].setDamage(heroes[i].getDamage() + booster);
                System.out.println("Magics super power:" + (heroes[i].getDamage() + 10));
                break;

            }
        }
    }
}

