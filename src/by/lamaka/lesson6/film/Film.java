package by.lamaka.lesson6.film;

public class Film {
    /*19. Создать класс Фильм с внутренним классом, с помощью объектов которо-
    го можно хранить информацию о продолжительности, жанре и режиссерах
    фильма.*/
    private String name;
    private FilmInfo filmInfo;

    public Film() {
    }

    public Film(String name, String genre, int duration, String producer) {
        filmInfo = new FilmInfo();
        this.name = name;
        filmInfo.genre = genre;
        filmInfo.duration = duration;
        filmInfo.producer = producer;
    }

    class FilmInfo {
        private String genre;
        private int duration;
        private String producer;

        {
            genre = "";
            duration = 0;
            producer = "";
        }

        private void addProducer(String producer) {
            this.producer += "\t" + producer + "\t";
        }
    }

    public void setGenre(String genre) {
        filmInfo.genre = genre;
    }

    public String getGenre() {
        return filmInfo.genre;
    }

    public void setDuration(int duration) {
        filmInfo.duration = duration;
    }

    public int getDuration() {
        return filmInfo.duration;
    }

    public void setProducer(String producer) {
        filmInfo.producer = producer;
    }

    public String getProducer() {
        return filmInfo.producer;
    }

    public void addProducer(String producer) {
        filmInfo.addProducer(producer);
    }

    public String getAllInfo() {
        return "Name : " + name + "\nGenre : " + filmInfo.genre + "\nDuration : " + filmInfo.duration +
                "min\nPoducers : " + filmInfo.producer;
    }
}
