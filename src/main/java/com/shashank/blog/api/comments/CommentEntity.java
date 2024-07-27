package com.shashank.blog.api.comments;


import com.shashank.blog.api.blogs.BlogEntity;
import com.shashank.blog.api.common.BaseEntity;
import com.shashank.blog.api.users.UserEntity;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.UUID;

@Entity(name = "comments")
public class CommentEntity extends BaseEntity {

    @Column(nullable = false, length = 150)
    String title;

    @Column(nullable = false, length = 500)
    String body;


    @ManyToOne
    UserEntity author;


    @ManyToOne
    BlogEntity blog;


}
