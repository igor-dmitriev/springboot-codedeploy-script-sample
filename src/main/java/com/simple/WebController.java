package com.simple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alan Jeon on 24/04/2017.
 */
@RestController
@RequestMapping("/test")
public class WebController {
  @GetMapping(value = "/")
  public String getItem() {
    return "1";
  }
}
