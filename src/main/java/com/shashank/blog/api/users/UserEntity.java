package com.shashank.blog.api.users;


import com.shashank.blog.api.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.UUID;

@Entity(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity  extends BaseEntity {

    @Column(nullable = false,unique = true,length=30)
    String username;
    @Column(nullable = false,unique = true,length=50)
    String email;
    @Column(nullable = false,length = 100)
    String password;
    @Column(length = 150)
    String bio;






}
