package com.bootcamp.demo.demo_restapi.model;

import lombok.Getter;
import lombok.ToString;

@Getter // This class is designed for Serialization(JSON -> Object) ONLY.
// So, only getter is required.
// @Setter
@ToString
public class User {
  private Integer id;
  private String name;
  private String username;
  private String email;
  private Address address;
  private String phone;
  private String website;
  private Company company;
  
  @Getter
  @ToString
  public static class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    @Getter
    @ToString
    public static class Geo {
      private String lat;
      private String lng;
    }
    
  }

  @Getter
  @ToString
  public static class Company {
    private String name;
    private String catchPhrase;
    private String bs;
  }
}
