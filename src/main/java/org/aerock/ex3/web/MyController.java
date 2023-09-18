package org.aerock.ex3.web;


import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Log4j2
public class MyController {


    @GetMapping("/main")
    public void main(){
       log.info("----------------------------------main");

    }
}
