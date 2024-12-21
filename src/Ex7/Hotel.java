package Ex7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;
    private ArrayList<Book> books;

    public Hotel() {
        rooms = new ArrayList<>();
        books = new ArrayList<>();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addARoom(Room room){
        rooms.add(room);
    }

    public void addABook(Book book) {
        books.add(book);
    }

    public ArrayList<Room> getFreeRooms(LocalDate specificDate) {
        ArrayList<Room> freeRooms = new ArrayList<>();
        for (Room r : rooms) {

            boolean isFree = true;

            for (Book b : books) {

                if (r.equals(b.getRoom())) {
                    if (!specificDate.isBefore(b.getCheckinDate()) && !specificDate.isAfter(b.getCheckoutDate())) {
                        isFree = false;
                        break;
                    }

                }

            }
            if (isFree) {
                freeRooms.add(r);
            }
        }
        return freeRooms;
    }

    public boolean freeSpecificRoomSpecificDate(Room room, LocalDate specificDate){

        boolean isFree = true;

        for (Book b: books){
            if (b.getRoom().equals(room) && !specificDate.isAfter(b.getCheckoutDate()) && !specificDate.isBefore(b.getCheckinDate())){
                isFree = false;
            }
        }
        return isFree;

    }



}
