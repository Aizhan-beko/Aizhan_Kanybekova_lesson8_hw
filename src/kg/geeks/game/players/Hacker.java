package kg.geeks.game.players;

import kg.geeks.game.logic.RpgGame;

import java.util.Random;

public class Hacker extends Hero {
    private int stolenHealth;

    public Hacker(int health, int damage, int stolenHealth, String name) {
        super(health, damage, SuperAbility.ADD_TO_HERO, name);
        this.stolenHealth = stolenHealth;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int stolenHealth = 10;
        boss.setHealth(boss.getHealth()-stolenHealth);
        for (int i = 0; i < heroes.length; i++) {
            if(heroes[i]!=this&&heroes[i].getHealth()>0){
                heroes[i].setHealth((heroes[i].getHealth()+stolenHealth));
                System.out.println("Hacker steals"+ stolenHealth+"health points from boss transfers it to" +heroes[i].getName());
                break;

            }

            /*if (heroes[i].getHealth() > 0 && this != heroes[i]) ;
            Random random = new Random();

            int randomIndex = random.nextInt(heroes.length);
            Hero randomHero = heroes[randomIndex];
            randomHero.setHealth(randomHero.getHealth() + this.stolenHealth);
            System.out.println("Hacker has used stolen health" + stolenHealth + " applied it to" + randomHero.getName());
            break;*/


        }


    }
}
