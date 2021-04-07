package by.htp.lamaka.cosmodrome;

public class Run {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        cosmodrome.launch(new Shuttle());
        cosmodrome.launch(new SpaceX());
    }
}
