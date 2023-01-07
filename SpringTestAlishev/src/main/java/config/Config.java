package config;

import music.ClassicalMusic;
import music.Music;
import music.MusicPlayer;
import music.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.LinkedList;
import java.util.List;

@Configuration
@ComponentScan("music")
@PropertySource("classpath:file.properties")
public class Config {

    @Bean
    ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    List<Music> randomMusic(){
        List<Music> result = new LinkedList<>();
        result.add(classicalMusic());
        result.add(rockMusic());
        return result;
    }

    @Bean
    MusicPlayer musicPlayer(){
        return new MusicPlayer(randomMusic());
    }

}
