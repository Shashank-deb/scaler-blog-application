package com.shashank.blog.api.blogs;


import com.shashank.blog.api.common.BaseEntity;
import com.shashank.blog.api.users.UserEntity;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.UUID;

@Entity(name = "blogs")
public class BlogEntity extends BaseEntity {



    @Column(nullable = false,length=150)
    String title;


    @Column(nullable = false,length=150)
    String slug;


    @Column(nullable = false,length=100)
    String subtitle;


    @Column(nullable = false,length = 5000)
    String body;


    @ManyToOne
    UserEntity author;



}
