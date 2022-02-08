package ru.alishev.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
//@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("doing init");
    }
    @Override
    public String getSong() {
        return "Classical music 1";
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroing all");
    }
}
