package springbook.chap1.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springbook.user.domain.User;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

<<<<<<< HEAD:tobyspringin5/src/main/java/springbook/chap1/dao/UserDaoTest.java
        ConnectionMaker connectionMaker = new DConnectionMaker();

        UserDao dao = new UserDao(connectionMaker);
=======
        ApplicationContext context = new AnnotationConfigApplicationContext(CountingDaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);

        CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
        System.out.println("counting :" + ccm.getCounter());
>>>>>>> 22bfe93416735bcc9645fc5c5649c26e88cc234c:tobyspringin5/src/main/java/springbook/user/dao/UserDaoTest.java

        User user = new User();
        user.setId("hjin9445");
        user.setName("장호진");
        user.setPassword("apfhd");

        dao.add(user);

        System.out.println(user.getId());

        User user1 = dao.get(user.getId());
        System.out.println(user1.getName());
        System.out.println(user1.getPassword());
        System.out.println(user1.getId() + " 조회 성공");
    }

}
