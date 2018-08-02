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


@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {


    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveTest() {
        User user = new User();
        user.setName("ugur");
        user.setSurname("artun");
        user.setPhone("05554443322");
        userRepository.save(user);

        List users = userRepository.findAll();
        assertEquals("ugur", ((User)users.get(0)).getName());

    }


}
