import java.io.StringReader;

public class EventLog {
    public String[] events;

    public EventLog() {
        this.events = new String[100];
    }

    public void Print() {
        for(String event : this.events) {
            System.out.println(event);
        }
    }

    public String editEvent(String eventToEdit, String newEvent) {
        for(String event: this.events){
            if(event.equals(eventToEdit)){
                event = newEvent;
                return "Event edited";
            }
        }
        throw new EventNotFound("Event not found");
    }

    public void addEvent(String event) {
        if (events.length >= 100) {
            throw new IndexOutOfBoundsException("Maximum number of events reached");
        }
        events[events.length - 1] = event;
    }

}
