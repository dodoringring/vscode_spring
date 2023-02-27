package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/home/*") // WEB-INF/view/home/?????.jsp
public class HomeController {
  @GetMapping("index")
  public String index() {
    log.info("index호출");
    return "home/index";
    // 스프링 컨테이너가 알아서 해준다.
  }
  @GetMapping("index2")
  public String index2() {
    log.info("index호출");
    return "home/index";
    // 스프링 컨테이너가 알아서 해준다.
  }

}
