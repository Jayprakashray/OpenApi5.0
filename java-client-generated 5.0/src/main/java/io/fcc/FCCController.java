package io.fcc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FCCController {

    @RequestMapping("/getAccount")
  public String getAccount() {
    	
    	ServiceHelper serivce = new ServiceHelper();
    	String jsonString = serivce.getAccountDetails();
    	
        return jsonString;
    }

}