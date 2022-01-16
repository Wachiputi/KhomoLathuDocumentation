package com.tdcodes.springboot.swaggertdcodes.Khomoresource;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/khomo")
public class KhomoResource {

    @GetMapping
    public String khomo(){
        return "This is a documentation of my project called khomoLathu web application.the web app uses " +
                "various classes through out its implementation.some of the classes are Khomo.java, " +
                "khomoserviceApplication,khomoController and khomoImplementation jus to mention a few." +
                "the purpose of this web app is available in this web applications problem" +
                "the app has been been developed with various tool such as" +
                "xampp, this is a conrol panel composing of apache,tomcat and mysql data base" +
                "with it i have bee able to create a database called freestack." +
                "using postman,i have been able to post several parameters sa per described in khomoserviceapplication source code" +
                "i have also been able to get whatever data from the database using a get method also implemented in the same" +
                "the following are the parameters i used to get and post clents data to and from the database" +
                "locahost:8080/khomo/add" +
                "localhost:8080/khomo/get" +
                "with these i was able to get and post new data to my database";
    }
    @PostMapping("/post")
    public String khomoPost(@RequestBody final String khomo){
        return khomo;
    }
    @PutMapping("/put")
    public String khomoPut(@RequestBody final String khomo){
        return khomo;
    }
}
