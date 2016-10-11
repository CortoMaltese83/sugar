package com.example.model.rv_row;

/**
 * Created by francesco.lombardi on 07/10/16.
 */
public class SingleBookRow {

    private String title;
    private String edition;

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
}
