package music;

import org.springframework.stereotype.Component;

@Component("classMusic")
public class ClassicalMusic implements Music{

    private ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return "Playing Mozart";
    }

}
