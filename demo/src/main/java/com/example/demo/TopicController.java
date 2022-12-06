package com.example.demo;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Description"),
            new Topic("Django", "Django Framework", "Django Description"),
            new Topic("Flask", "Flask Framework", "Flask Description")
        );
    }
}
