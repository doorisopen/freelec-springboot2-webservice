package com.doop.book.springboot.domain.posts;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // (6)
@NoArgsConstructor // (5)
@Entity // (1)
public class Posts {

    @Id // (2)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // (3)
    private Long id;

    @Column(length = 500, nullable = false) // (4)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // (7)
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
