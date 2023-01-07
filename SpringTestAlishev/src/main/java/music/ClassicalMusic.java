package music;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music{

    public ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return "Playing Mozart";
    }

}
