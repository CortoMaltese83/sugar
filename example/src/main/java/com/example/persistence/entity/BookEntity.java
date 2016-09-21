package com.example.persistence.entity;

import com.orm.SugarRecord;

/**
 * Created by francesco.lombardi on 21/09/16.
 */

public class BookEntity extends SugarRecord {

    String title;
    String edition;

    public BookEntity(){
    }

    public BookEntity(String title, String edition){
        this.title = title;
        this.edition = edition;
    }

    /**
     * @return Gets the value of edition and returns edition
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the edition
     * use getEdition() to get the value of edition
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * @return Gets the value of title and returns title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title
     * use getTitle() to get the value of title
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
