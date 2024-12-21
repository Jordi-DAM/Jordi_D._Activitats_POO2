package Ex7;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room>rooms;
    private ArrayList<Book>books;

    public Hotel(){
        rooms = new ArrayList<>();
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

    public void addABook(Book book){
        books.add(book);
    }



}
