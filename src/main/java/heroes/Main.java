package heroes;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        HeroFactory heroFactory = new ConfigurableHeroFactory(new HeroesConfigImpl());
        gameManager.fight(heroFactory.createNewHero(),heroFactory.createNewHero());
    }
}
