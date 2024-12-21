package Ex7;

import java.time.LocalDateTime;

public class Book {

    private LocalDateTime checkinDate;
    private LocalDateTime checkoutDate;
    private Room room;

    public Book(LocalDateTime checkinDate, LocalDateTime checkoutDate, Room room){
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.room = room;
    }


    public LocalDateTime getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(LocalDateTime checkinDate) {
        this.checkinDate = checkinDate;
    }

    public LocalDateTime getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDateTime checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
