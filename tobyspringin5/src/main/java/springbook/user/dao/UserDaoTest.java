package springbook.user.dao;

import springbook.user.domain.User;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UserDao dao = new UserDao();

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
