package com.bootcamp.demo.demo_restapi.bootcamp;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UrlManager {
  private Scheme scheme;
  private String domain;
  private String endpoint;

  @Override
  public String toString() {
    return scheme.getUrlPrefix()//
    .concat(this.domain)//
    .concat(this.endpoint);
  }
}
