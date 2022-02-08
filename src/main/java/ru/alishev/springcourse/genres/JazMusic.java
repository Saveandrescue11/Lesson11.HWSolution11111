package ru.alishev.springcourse.genres;

import ru.alishev.springcourse.Music;

public class JazMusic implements Music {
    @Override
    public String getSong() {
        return "Jaz Music 1";
    }
}
