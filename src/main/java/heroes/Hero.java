package heroes;

import lombok.*;

/**
 * @author Evgeny Borisov
 */
@ToString
@EqualsAndHashCode
@Setter
@Getter
public abstract class Hero {
    private int hp;
    protected int power;
    private String name;

    public Hero(int hp, int power, String name) {
        this.hp = hp;
        this.power = power;
        this.name = name;
    }

    public void decreaseHp(int delta) {
        this.setHp(this.getHp()-delta);
    }

    public void decreasePower(int delta) {
        this.setPower(this.getPower()-delta);
    }

    public boolean isAlive() {
        return hp > 0;
    }


    public abstract KickResult kick(Hero enemy);









}
