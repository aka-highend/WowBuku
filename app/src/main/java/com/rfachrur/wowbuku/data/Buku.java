package com.rfachrur.wowbuku.data;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by rfachrur on 12/6/16.
 *
 */

public class Buku extends RealmObject {

    @PrimaryKey
    private long id;

    private String title;

    private String description;

    private String author;

    private String imageUrl;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
