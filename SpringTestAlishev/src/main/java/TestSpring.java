import config.Config;
import music.ClassicalMusic;
import music.MusicPlayer;
import music.RockMusic;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        player.playMusic();
    }

}
