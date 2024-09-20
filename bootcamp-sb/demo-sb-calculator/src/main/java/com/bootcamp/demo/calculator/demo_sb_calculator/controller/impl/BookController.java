package com.bootcamp.demo.calculator.demo_sb_calculator.controller.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.calculator.demo_sb_calculator.controller.BookOperation;
import com.bootcamp.demo.calculator.demo_sb_calculator.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@ResponseBody
public class BookController implements BookOperation{
  

  public Book getBook(int id, double price) { 
    return new Book(id, price);
  }

  // User input
 
  // public Book getBook2(@RequestParam int id,@RequestParam double price) { 
  // http://localhost:8081/book?id=1&price=10.3
  public Book getBook2(int id, double price) { 
  // http://localhost:8081/book?A=1&B=10.3
    return new Book(id, price);
  }

  public List<Book> getBooks() { 
    return List.of(new Book(1, 10.3), new Book(2, 99.9));
  }

  // return set
  public Set<Book> getBooks2() { 
    // return Set.of(new Book(1, 10.3), new Book(2, 99.9), new Book(2, 99.9)); // set cannot put duplictae data
    return Set.of(new Book(1, 10.3), new Book(2, 99.9), new Book(3, 99.9));
  }


  // return map
  public Map<Integer, Book> getBookmap() { 
    Map<Integer, Book> bookmap = new HashMap<>();
    bookmap.put(1, new Book(1, 10.3));
    bookmap.put(2, new Book(2, 99.9));
    return bookmap;
  }

  // return Book[]
  public Book[] getBookArray() { 
    return new Book [] {new Book(1, 10.3), new Book(2, 99.9)};
  }
}