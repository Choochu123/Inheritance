package Ex3_MusicFestival;

import com.sun.tools.javac.Main;

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
        allEvents.add(new Activities("Hula Hooping","Physical","Spot 8"));
        allEvents.add(new Activities("Coloring", "Art","Spot 1"));


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

            switch (choice) {
                case 1 -> {
                    System.out.println("not yet implemented");
                }
                case 2 -> {
                    System.out.println("not yet implemented2");
                }
                case 3 -> {
                    System.out.println("not yet implemented3");
                }
                case 4 -> {
                    System.out.println("not yet implemented4");
                }
                case 5 -> {
                    System.out.println("not yet implemented5");
                }
                case 6 -> {
                    break;
                }
            }
        }

    }//run

    public static void addEvent() {
        System.out.println("What event type is your event?");
        String eventType = Library.input.nextLine();
    }

}
