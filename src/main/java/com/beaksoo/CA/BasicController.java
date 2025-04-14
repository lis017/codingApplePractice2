package com.beaksoo.CA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/")
    @ResponseBody
    String hello(){
        return "<h4>안녕하쇼</h4>";
    }

    @GetMapping("/about")
    @ResponseBody
    String hellops(){
        return "피싱사이트에요";
    }

    @GetMapping("/main")    //이거 왜 오류나는겨?
    public String main() {
        return "main.html";
    }

    @GetMapping("/index")    //이거 왜 오류나는겨?
    public String index() {
        return "index.html";
    }


}
