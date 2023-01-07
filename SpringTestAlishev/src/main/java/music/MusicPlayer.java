package music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

public class MusicPlayer {

    private List<Music> music;
    @Value("${count}")
    private int trackCount;
    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }


    public void playMusic() {
        for (Music m : music){
            System.out.println(m.getSong());
        }
    }
}
