package real_spring.aop_advanced.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import real_spring.aop_advanced.dao.DaoA;

/**
 * @author Evgeny Borisov
 */
@Service
public class ServiceB {
    @Autowired
    private DaoA dao;

    public void doB() {
        System.out.println("BBBBBBBBBBBBB");
        dao.save();
    }
}
