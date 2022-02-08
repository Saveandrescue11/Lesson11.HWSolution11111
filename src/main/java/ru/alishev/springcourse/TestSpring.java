package ru.alishev.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.alishev.springcourse.config.SpringConfig;
import ru.alishev.springcourse.genres.ClassicalMusic;

/**
 * @author Neil Alishev
 */
public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.playMusic());

//        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic",ClassicalMusic.class);

        context.close();
    }
}
