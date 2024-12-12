package Ex3_MusicFestival;

class SmallStageEvent extends Event {

    public String genre;

    public SmallStageEvent(String name, String type, String genre) {
        super(name, type);
        super.setLocation("Small Stage");
        this.genre = genre;
    }
    public void eventGenre(String genre){
        this.genre = genre;
    }//eventGenre
}
