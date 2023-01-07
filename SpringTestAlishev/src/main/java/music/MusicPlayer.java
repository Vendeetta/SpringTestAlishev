package music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music music;
    @Value("10")
    private int trackCount;
    @Autowired

    public MusicPlayer(@Qualifier("rockMusic") Music music) {
        this.music = music;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    public Music getMusic() {
        return music;
    }


    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println(music.getSong() + " " + trackCount);
    }
}
