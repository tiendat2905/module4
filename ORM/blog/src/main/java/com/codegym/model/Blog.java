package com.codegym.model;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "blogs")
public class Blog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @Column(columnDefinition = "varchar(1250)")
    private String shortContent;

    @Column(columnDefinition = "longtext")
    private String fullContent;

    private String image;

    private LocalDateTime publishDate = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "categoryId", referencedColumnName = "id")
    private Category category;

    public Blog() {
    }

    public Blog(Integer id, String title, String shortContent, String fullContent, String image, LocalDateTime publishDate) {
        this.id = id;
        this.title = title;
        this.shortContent = shortContent;
        this.fullContent = fullContent;
        this.image = image;
        this.publishDate = publishDate;
    }

    public Blog(Integer id, String title, String shortContent, String fullContent, String image, LocalDateTime publishDate, Category category) {
        this.id = id;
        this.title = title;
        this.shortContent = shortContent;
        this.fullContent = fullContent;
        this.image = image;
        this.publishDate = publishDate;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", shortContent='" + shortContent + '\'' +
                ", fullContent='" + fullContent + '\'' +
                ", image='" + image + '\'' +
                ", publishDate=" + publishDate +
                ", category=" + category +
                '}';
    }
}
