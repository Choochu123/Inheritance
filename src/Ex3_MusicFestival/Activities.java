package Ex3_MusicFestival;

class Activities extends NonMusicEvent {

    public String type;
    public Activities(String name, String type, String loc) {
        super(name, type, loc);
        super.setLocation(loc);
        this.type = type;
    }//NonMusicEvent2

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}