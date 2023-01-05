package music;

public class MusicPlayer {

    private Music music;

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    private int trackCount;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(){

    }

    public void playMusic(){
        System.out.println(music.getSong() + " " + trackCount);
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
