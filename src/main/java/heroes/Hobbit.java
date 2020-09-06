package heroes;

/**
 * @author Evgeny Borisov
 */
public class Hobbit extends Hero {
    public Hobbit(String name) {
        super(3, 0, name);
    }

    @Override
    public KickResult kick(Hero enemy) {
        cry();
        return new KickResult("Я же хобит я никого не бью");
    }

    private void cry() {
        System.out.println("auauauauuaua");
    }
}
