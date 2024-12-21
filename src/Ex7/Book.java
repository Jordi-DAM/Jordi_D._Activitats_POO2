package Ex7;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Book {

    private LocalDate checkinDate;
    private LocalDate checkoutDate;
    private Room room;

    public Book(LocalDate checkinDate, LocalDate checkoutDate, Room room){
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.room = room;
    }


    public LocalDate getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(LocalDate checkinDate) {
        this.checkinDate = checkinDate;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
