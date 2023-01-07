package music;

import org.springframework.stereotype.Component;

public class RockMusic implements Music{

    public RockMusic() {
    }

    @Override
    public String getSong() {
        return "Playing Ozzy Osbourne";
    }
}
