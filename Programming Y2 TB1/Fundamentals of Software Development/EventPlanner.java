import java.util.ArrayList;
import java.util.List;

public class EventPlanner {
    private List<Event> events;

    public EventPlanner(List<Event> events) {
        this.events = events;
    }

    public EventPlanner() {
        events = new ArrayList<Event>();
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public boolean addEvent(Event e) {
        try {
            // Check for event already exists
            boolean exists = false;
            for (Event event : events) 
            if (event.equals(e)) exists = true;

            // Add event if it's not already present
            if (!exists) events.add(e);

            return true;
        } catch (Exception ex) {
            System.out.print(ex.toString());
            return false;
        }
    }

    public int totalTicketsSold() {
        int x = 0;
        for (Event event : events) x += event.getTicketsSold();
        return x;
    }
}
