package ru.alishev.springcourse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.alishev.springcourse.Computer;
import ru.alishev.springcourse.Music;
import ru.alishev.springcourse.MusicPlayer;
import ru.alishev.springcourse.genres.ClassicalMusic;
import ru.alishev.springcourse.genres.JazMusic;
import ru.alishev.springcourse.genres.RockMusic;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("ru.alishev.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public JazMusic jazMusic() {
        return new JazMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), rockMusic(), jazMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
