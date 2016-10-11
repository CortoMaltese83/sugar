package com.example.persistence.dao;

import com.example.persistence.entity.BookEntity;

import java.util.List;

/**
 * Created by francesco.lombardi on 11/10/16.
 * BookDAO layer
 */

public class BookDAO {

    public static List<BookEntity> getAllBooks(){
        List<BookEntity> books = new BookEntity().listAll(BookEntity.class);
        return books;
    }

}
