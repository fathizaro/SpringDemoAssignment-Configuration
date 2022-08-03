package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudantConf {
    @Bean
    public Student student(){

        return new Student(9917059, "Adam Bayyari", phone(), address());
    }

    @Bean
    public Address address(){

        return  new Address("APEX", "NC", "USA", "27539");
    }

    @Bean
    public List<Phone> phone() {
        List<Phone> ph = new ArrayList<>();
        ph.add(new Phone("989-774-0262"));
        ph.add(new Phone("789-204-7142"));
        ph.add(new Phone("615-578-0045"));
        return ph;
    }
}
