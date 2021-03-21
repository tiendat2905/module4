package com.codegym.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "posts")
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String shortContent;
    private String fullContent;

    @ManyToOne
    @JoinColumn(columnDefinition = "categoryId", referencedColumnName = "id")
    private Category category;

    public Post() {
    }

    public Post(int id, String title, String shortContent, String fullContent) {
        this.id = id;
        this.title = title;
        this.shortContent = shortContent;
        this.fullContent = fullContent;
    }

    public Post(int id, String title, String shortContent, String fullContent, Category category) {
        this.id = id;
        this.title = title;
        this.shortContent = shortContent;
        this.fullContent = fullContent;
        this.category = category;
    }

    public Post(String title, String shortContent, String fullContent, Category category) {
        this.title = title;
        this.shortContent = shortContent;
        this.fullContent = fullContent;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortContent() {
        return shortContent;
    }

    public void setShortContent(String shortContent) {
        this.shortContent = shortContent;
    }

    public String getFullContent() {
        return fullContent;
    }

    public void setFullContent(String fullContent) {
        this.fullContent = fullContent;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
