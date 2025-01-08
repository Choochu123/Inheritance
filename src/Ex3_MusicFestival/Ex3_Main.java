package Ex3_MusicFestival;

import com.sun.tools.javac.Main;

import javax.crypto.spec.PSource;
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

        allEvents.add(new SmallStageEvent("Chu's Chuckles", "performance", "Comedy"));
        allEvents.add(new SmallStageEvent("Fluffy's Comedy", "performance", "Comedy"));
        allEvents.add(new SmallStageEvent("The Joe Rogan Experience", "podcast", "Comedy"));
        allEvents.add(new SmallStageEvent("Karaoke Kings", "performance", "singing"));
        allEvents.add(new SmallStageEvent("Hot Dog Eating Competition", "competition", "game"));

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
                    if (foundIndex >= 0) {
                        allEvents.get(foundIndex).printMe();
                    } else {
                        System.out.println("Event not found. Please try again");
                    }
                    break;
                case 3:
                    filterByEventType();
                    System.out.println();
                    break;
                case 4:
                    printAllEvents();
                    System.out.println();
                    break;
                case 5:
                    addMainStageTech();
                    break;
                case 6:
                    System.out.println("Good Bye");
                    finished = true;
                    break;
                default:
                    System.out.println("Number out of bounds. Please pick a whole number between 1 and 6");
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
        System.out.println("What class is the event that you would like to add? (Options: Main stage event, Small stage event, Activities)");
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
        } else if (eventClass.equalsIgnoreCase("Activities")) {
                System.out.println("What event type is your activity? (e.g physical, art)");
                String activityType = Library.input.nextLine();

                System.out.println("Where is the location of your event?");
                String eventLoc = Library.input.nextLine();

                allEvents.add(new Activities(eventName, activityType, eventLoc));
            } else {
            System.out.println("Please pick a valid event class");
        }
    }//addEvent

    public static int searchEvent(String name, ArrayList<Event> list) {
        if (list.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEventName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        System.out.println();
//        System.out.println("Could not find event");
        return -1;
    }//searchForEvent

    public static void filterByEventType() {
        System.out.println("What event type would you like to filer?\n(main stage, small stage, activities )");
        String filterIndex = Library.input.nextLine();
        boolean found = false;

        if (filterIndex.strip().equalsIgnoreCase("main stage")) {
            for (Event event : allEvents) {
                if (event instanceof MainStageEvent) {
                    event.printMe();
                    found = true;
                }
            }
        }
        if (filterIndex.strip().equalsIgnoreCase("small stage")) {
            for (Event event : allEvents) {
                if (event instanceof SmallStageEvent) {
                    event.printMe();
                    found = true;
                }
            }
        }
        if (filterIndex.strip().equalsIgnoreCase("activities")) {
            for (Event event : allEvents) {
                if (event instanceof Activities) {
                    event.printMe();
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Event not found, please try again.");
        }
    }//filterByEventType

    public static void printAllEvents() {
        System.out.println("Activities: ");
        printActivities();
        System.out.println();
        System.out.println("Main Stage Events:");
        printMainStageEvent();
        System.out.println();
        System.out.println("Small Stage Events: ");
        printSmallStageEvent();
    }//printAllEvents

    public static void printActivities() {
        for (Event event : allEvents) {
            if (event instanceof Activities) {
                event.printMe();
            }
        }
    }//printActivities

    public static void printMainStageEvent() {
        for (Event event : allEvents) {
            if (event instanceof MainStageEvent) {
                event.printMe();
            }
        }
    }//printMainStageEvent

    public static void printSmallStageEvent() {
        for (Event event : allEvents) {
            if (event instanceof SmallStageEvent) {
                event.printMe();
            }
        }
    }//printSmallStageEvent

    public static void addMainStageTech(){
        System.out.println("What event are you looking for? Please note that this event must be a Main Stage Event.");
        String index = Library.input.nextLine();
        int foundIndex = searchEvent(index, allEvents);
        if(foundIndex >= 0 && allEvents.get(foundIndex) instanceof MainStageEvent){
            System.out.println("What are the tech requirements for " + allEvents.get(foundIndex).getEventName() + "?");
            String techreq = Library.input.nextLine();
            ((MainStageEvent) allEvents.get(foundIndex)).addTech(techreq);
        } else {
            if(foundIndex < 0){
                System.out.println("Event not found. Please try again");
            } else if (!(allEvents.get(foundIndex) instanceof MainStageEvent)){
                System.out.println("Event is not a Main Stage Event. Please try again.");
            }
        }

    }//addMainStageTech

}//class