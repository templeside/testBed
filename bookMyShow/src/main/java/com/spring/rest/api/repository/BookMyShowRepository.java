package com.spring.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.api.model.BookRequest;

public interface BookMyShowRepository extends JpaRepository<BookRequest, Integer>{

}
