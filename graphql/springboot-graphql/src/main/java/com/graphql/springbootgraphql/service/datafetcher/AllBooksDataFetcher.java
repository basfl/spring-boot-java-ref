package com.graphql.springbootgraphql.service.datafetcher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.graphql.springbootgraphql.model.Book;
import com.graphql.springbootgraphql.repository.BookRepository;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class AllBooksDataFetcher implements DataFetcher<List<Book>>{

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> get(DataFetchingEnvironment dataFetchingEnvironment) {
        return bookRepository.findAll();
    }
}