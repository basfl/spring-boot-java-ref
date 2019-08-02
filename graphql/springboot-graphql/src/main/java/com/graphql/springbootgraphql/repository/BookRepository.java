package com.graphql.springbootgraphql.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.springbootgraphql.model.Book;

public interface BookRepository extends JpaRepository<Book, String> {
}