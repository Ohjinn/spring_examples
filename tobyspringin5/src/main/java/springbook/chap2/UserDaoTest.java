package springbook.chap2;

import org.junit.jupiter.api.Test;

public class UserDaoTest {

    @Test
    void addAndGet() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
    }
}
