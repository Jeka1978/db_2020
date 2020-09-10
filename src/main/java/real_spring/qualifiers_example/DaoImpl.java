package real_spring.qualifiers_example;

import org.springframework.stereotype.Repository;

import static real_spring.qualifiers_example.DBType.ORACLE;

/**
 * @author Evgeny Borisov
 */
@DeutscheRepo(ORACLE)
public class DaoImpl implements Dao {
    @Override
    public void saveAll() {
        System.out.println("saving to ORACLE");
    }
}
