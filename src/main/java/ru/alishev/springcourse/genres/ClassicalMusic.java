package ru.alishev.springcourse.genres;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.alishev.springcourse.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
//@Component
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Classical music 1";
    }

}
