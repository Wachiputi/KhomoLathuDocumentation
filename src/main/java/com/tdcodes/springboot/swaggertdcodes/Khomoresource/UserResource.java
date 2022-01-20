package com.tdcodes.springboot.swaggertdcodes.Khomoresource;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserResource {
    @GetMapping
    public List<User>getUsers() {
        return Arrays.asList(
                new User("mr chiputi", 2000L),
                new User("mr Godot", 1000L)
        );
    }
    @GetMapping("/{userName}")
    public User getUser(@PathVariable("username") final String userName){
        return new User(userName, 1000L);
    }
        private class User{
            private String userName;
            private Long phone_number;

            public User(String userName, Long phone_number) {
                this.userName = userName;
                this.phone_number = phone_number;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public Long getPhone_number() {
                return phone_number;
            }

            public void setPhone_number(Long phone_number) {
                this.phone_number = phone_number;
            }
        }
    }

