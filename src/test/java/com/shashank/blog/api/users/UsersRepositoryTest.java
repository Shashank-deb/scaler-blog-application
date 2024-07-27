package com.shashank.blog.api.users;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;

import java.util.Date;
import java.util.UUID;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UsersRepositoryTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void createUser() {

        UserEntity userEntity = new UserEntity(

                "shashank",
                "shashank@gmail.com",
                "shashankpassword",
                "shashankbio"
        );

        userEntity.setId(UUID.randomUUID());
        userEntity.setCreatedAt(new Date());


        var user = userRepository.save(userEntity);
        Assertions.assertNotNull(user.getId());
    }







    @Test
    public void findByUsername(){
        UserEntity userEntity = new UserEntity(
                "shashank",
                "shashank@gmail.com",
                "shashankpassword",
                "shashankbio"
        );
        userEntity.setId(UUID.randomUUID());
        userEntity.setCreatedAt(new Date());
        userRepository.save(userEntity);

        var user = userRepository.findByUsername("shashank");
        Assertions.assertEquals("shashank@gmail.com",user.getEmail());
    }
}





