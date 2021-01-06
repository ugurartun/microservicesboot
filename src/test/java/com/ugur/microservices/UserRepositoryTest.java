package com.ugur.microservices;

import com.ugur.microservices.domain.User;
import com.ugur.microservices.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {


    @Autowired
    private UserRepository userRepository;

    private static final String TEST_NAME = "ugur";
    private static final String TEST_SURNAME = "artun";
    private static final String TEST_PHONE = "0555444322";


    /**
    @Test
    public void saveTest() {
        User user = new User();
        user.setName(TEST_NAME);
        user.setSurname(TEST_SURNAME);
        userRepository.save(user);

        List<User> users = userRepository.findAll();
        assertEquals(1, users.size());
        assertEquals(TEST_NAME, users.get(0).getName());

    }

    @Test
    public void findByPhoneTest() {
        User user = new User();
        user.setName(TEST_NAME);
        user.setSurname(TEST_SURNAME);
        user.setPhone(TEST_PHONE);
        userRepository.save(user);
        user = userRepository.findByPhoneNumber(TEST_PHONE);
        assertNull(userRepository.findByPhoneNumber("05554443311"));
        assertEquals(TEST_NAME,user.getName());

    }
    */
}
