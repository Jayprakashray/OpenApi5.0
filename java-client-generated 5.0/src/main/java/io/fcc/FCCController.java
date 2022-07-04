package io.fcc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FCCController {

    @RequestMapping("/getAccount")
  public String getAccount() {
        return "Hello World, Spring Boot!-FCCController-getAccount.";
    }

}