package com.bootcamp.demo.calculator.demo_sb_calculator.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo.calculator.demo_sb_calculator.model.Book;

public interface BookOperation {
  
  
  @GetMapping(value = "/book/{id}/{price}")
  public Book getBook(@PathVariable int id,@PathVariable double price);


  // User input
  @GetMapping(value = "/book")
  public Book getBook2(@RequestParam(value = "A") int id,@RequestParam(value = "B") double price);

  @GetMapping(value = "books")
  public List<Book> getBooks();

  // return set
  @GetMapping(value = "books2")
  public Set<Book> getBooks2();

  // return map
  @GetMapping(value = "/bookmap")
  public Map<Integer, Book> getBookmap();

  // return Book[]
  @GetMapping(value = "/bookarray")
  public Book[] getBookArray();
}
