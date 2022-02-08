package ru.alishev.springcourse.genres;

import org.springframework.stereotype.Component;
import ru.alishev.springcourse.Music;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
//@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();

    @Override
    public String getSong() {
        return "Rock song 1";
    }
}
