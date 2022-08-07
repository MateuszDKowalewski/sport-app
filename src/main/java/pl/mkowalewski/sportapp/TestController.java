package pl.mkowalewski.sportapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestController {

  @GetMapping("hello")
  private String hello() {
    return "Hello Sport App!";
  }

}
