package Ex3_MusicFestival;

import com.sun.tools.javac.Main;

import javax.swing.text.html.ListView;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Ex3_Main {
    static ArrayList<Event> allEvents;

    public static void run() {
        allEvents = new ArrayList<>();
        allEvents.add(new MainStageEvent("Drizzy", "Music"));
        allEvents.add(new MainStageEvent("Walk off the Earth", "Music"));
        allEvents.add(new MainStageEvent("The Black Pumas", "Music"));
        allEvents.add(new MainStageEvent("Imagine Dragging", "Music"));
        allEvents.add(new MainStageEvent("Elliott's BreakDancing Club", "Dance"));

        allEvents.add(new Activities("Hackey Sack", "Physical", "Spot 10"));
        allEvents.add(new Activities("Face Painting", "Art", "Spot 2"));
        allEvents.add(new Activities("Hop Scotch", "Physical", "Spot 4"));
        allEvents.add(new Activities("Hula Hooping", "Physical", "Spot 8"));
        allEvents.add(new Activities("Coloring", "Art", "Spot 1"));

        allEvents.add(new NonMusicEvent("Curry Connection", "food truck", "Truck 9"));
        allEvents.add(new NonMusicEvent("Japan Fusion", "food truck", "Truck 2"));
        allEvents.add(new NonMusicEvent("Crystals for days", "souvenir sales", "Stall 3"));
        allEvents.add(new NonMusicEvent("Elliott's Eggs", "food truck", "Truck 8"));
        allEvents.add(new NonMusicEvent("Zev's Toys", "souvenir sales", "Truck 7"));

        allEvents.add(new SmallStageEvent("Chu's Chuckles", "performance", "Comedy"));

        //        allEvents.add(new NonMusicEvent("Curry Connection", "food truck", "Truck 9"));
//
//        ((MainStageEvent)allEvents.get(0)).addTech("Pyrotechnics");
//        ((MainStageEvent)allEvents.get(0)).addTech("Symphony Orchestra");
//
//        for (int i = 0; i < allEvents.size(); i++) {
//            System.out.println(allEvents.get(i).getEventName());
//
//            if(allEvents.get(i) instanceof MainStageEvent){
//                ((MainStageEvent) allEvents.get(i)).printTech();
//            }
//        }

        while (true) {
            System.out.println("Choose from the following options.");

            System.out.println("1. Add an Event\n2. Search by Events\n3. Filter by Event Type\n4. Print all Events grouped by type\n5. Add Main Stage Tech\n6. Exit");

            int choice = Library.input.nextInt();
            Library.input.nextLine();
            boolean finished = false;
            switch (choice) {
                case 1:
                    addEvent();
                    break;
                case 2:
                    System.out.println("What event would you like to find?");
                    String event = Library.input.nextLine();
                    int foundIndex = searchEvent(event, allEvents);
                    if(foundIndex >= 0){
                        allEvents.get(foundIndex).printMe();
                    }
                    break;
                case 3:
                    System.out.println("not yet implemented3");
                    break;
                case 4:
                    System.out.println("not yet implemented4");
                    break;
                case 5:
                    System.out.println("not yet implemented5");
                    break;
                case 6:
                    System.out.println("Good Bye");
                    finished = true;
                    break;
                default:
                    System.out.println("Number out of bounds. Please pick a whole number between 1 and 9");
                    break;
            }
            if (finished) {
                break;
            }
        }
    }//run

    public static void addEvent() {
        System.out.println("What is the name of the event you're adding?");
        String eventName = Library.input.nextLine();
        System.out.println("What class is the event that you would like to add? (Options: Main stage event, Small stage event, Non music event)");
        String eventClass = Library.input.nextLine();

        if (eventClass.equalsIgnoreCase("Main Stage Event") || eventClass.equalsIgnoreCase("Small Stage Event")) {
            System.out.println("What event type is your event? (e.g Music, dance, performance)");
            String eventType = Library.input.nextLine();

            if (eventClass.equalsIgnoreCase("Main Stage Event")) {
                allEvents.add(new MainStageEvent(eventName, eventType));
            } else if (eventClass.equalsIgnoreCase("Small Stage Event")) {
                System.out.println("What is the genre of the event you're adding? (e.g Comedy)");
                String eventGenre = Library.input.nextLine();

                allEvents.add(new SmallStageEvent(eventName, eventType, eventGenre));
            }
        } else if (eventClass.equalsIgnoreCase("Non Music Event")) {
            System.out.println("Is your event an activity?");
            String answer = Library.input.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("What event type is your event? (e.g physical, art)");
                String activityType = Library.input.next();

                System.out.println("Where is the location of your event?");
                String eventLoc = Library.input.nextLine();

                allEvents.add(new Activities(eventName, activityType, eventLoc));
            } else {
                System.out.println("What type is your event? (e.g food truck, souvenir sales)");
                String eventType = Library.input.nextLine();

                System.out.println("Where is the location of your event?");
                String eventLoc = Library.input.nextLine();

                allEvents.add(new NonMusicEvent(eventName, eventType, eventLoc));
            }
        } else {
            System.out.println("Please pick a valid event class");
        }
    }//addEvent

    public static int searchEvent(String name, ArrayList<Event> list) {
        if (list.size() == 0) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getEventName().equalsIgnoreCase(name)){
                return i;
            }
        }
        System.out.println();
        System.out.println("Could not find event");
        return -1;
    }//searchForEvent

}