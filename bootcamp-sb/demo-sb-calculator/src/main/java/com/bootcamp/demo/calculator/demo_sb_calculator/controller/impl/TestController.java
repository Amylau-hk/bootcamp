package com.bootcamp.demo.calculator.demo_sb_calculator.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.calculator.demo_sb_calculator.model.Book;

/**
 * @Controller + @Autowired
 * Spring will help validate if there is a bean for BookController, 
 * if yes, Spring create TestController bean.
 * if no, Server start fail, because the above validation fail.
 */

@Controller // bean
@ResponseBody
public class TestController {
  // new TestController(bookController)
  // bookController object is from Spring Context


  // 1. Field Injection
  // @Autowired // inject bookController object from Spring context into this obj ref
  private BookController bookController; // object reference

  // 2. Constructor Injection
  // @Autowired
  public TestController (BookController bookController) {
    this.bookController = bookController;
  }

  @GetMapping(value = "/test")
  public Book getBook() {
    return bookController.getBook(99, 100.9);
  }
  
}
