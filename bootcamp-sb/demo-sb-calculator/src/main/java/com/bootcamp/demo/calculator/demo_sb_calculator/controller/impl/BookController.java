package com.bootcamp.demo.calculator.demo_sb_calculator.controller.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.calculator.demo_sb_calculator.controller.BookOperation;
import com.bootcamp.demo.calculator.demo_sb_calculator.model.Bag;
import com.bootcamp.demo.calculator.demo_sb_calculator.model.Book;
import com.bootcamp.demo.calculator.demo_sb_calculator.model.Bag.Color;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
// @Controller annotation -> Before server stat completed, new BookController()
// The created object -> in Spring Context (not the heap memory, it is separated memory location)
// All these kind of objects, we call it "Bean"
// This bean MUST be created before server start completed.
// Implication: If the bean fail to created, server start fails. 
// It bean not exists, server start fail, no API services.
// It will check which object should be create first

@ResponseBody
public class BookController implements BookOperation{
  

  public Book getBook(int id, double price) { 
    return new Book(id, price, null);
  }

  // User input
 
  // public Book getBook2(@RequestParam int id,@RequestParam double price) { 
  // http://localhost:8081/book?id=1&price=10.3
  public Book getBook2(int id, double price) { 
  // http://localhost:8081/book?A=1&B=10.3
    return new Book(id, price, null);
  }

  public List<Book> getBooks() { 
    return List.of(new Book(1, 10.3, null), new Book(2, 99.9, null));
  }

  // return set
  public Set<Book> getBooks2() { 
    // return Set.of(new Book(1, 10.3), new Book(2, 99.9), new Book(2, 99.9)); // set cannot put duplictae data
    return Set.of(new Book(1, 10.3, null), new Book(2, 99.9, null), new Book(3, 99.9, null));
  }


  // return map
  // instance method
  public Map<Integer, Book> getBookmap() { 
    Map<Integer, Book> bookmap = new HashMap<>();
    bookmap.put(1, new Book(1, 10.3, null));
    bookmap.put(2, new Book(2, 99.9, null));
    return bookmap;
  }

  // return Book[]
  public Book[] getBookArray() { 
    return new Book [] {new Book(1, 10.3, null), new Book(2, 99.9, null)};
  }

  
   public Bag getBag() {
    return Bag.builder()
      .books(List.of(new Book(1, 10.3, List.of("abc", "def")), new Book(2, 99.9, List.of("ijk"))))
      .color(Color.RED)
      .build();
   }
}