package music;

public class ClassicalMusic implements Music{

    private ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return "Playing Mozart";
    }

    public void init(){
        System.out.println("init");
    }
    public void destr(){
        System.out.println("destr");
    }
}
