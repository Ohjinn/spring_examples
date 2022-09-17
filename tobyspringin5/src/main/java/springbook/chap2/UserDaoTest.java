package springbook.chap2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springbook.user.dao.DaoFactory;

public class UserDaoTest {

    @Test
    void addAndGet() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
    }
}
