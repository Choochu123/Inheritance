package Ex3_MusicFestival;

public abstract class Event {

    private static int lastEventID = 1000;
    private final int eventID;
    private final String eventName;
    private final String eventType; //ex food, music, any type of event/venue
    private String time;
    private String location;

    public Event(String name, String type) {
        eventID = ++lastEventID;    
        eventName = name;
        eventType = type;
        time = "tbd";
        location = "tbd";
    }

    public int getEventID() {
        return eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void printMe(){
        System.out.println("Name: " + eventName + " ID:" + eventID + " Type:" + eventType + " Location:" + location + " Time:" + time);
    }

}//end event
