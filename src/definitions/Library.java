/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] currentlyAvailable;

    public Library() {
        this.currentlyAvailable = new Book[100];
        for (int i = 0; i < currentlyAvailable.length; i++) {
            currentlyAvailable[i] = new Book();
        }
    }

    public Library(Book[] currentlyAvailable) {
        this.currentlyAvailable = currentlyAvailable;
    }

    public Book[] getCurrentlyAvailable() {
        return currentlyAvailable.clone();
    }

    public void setCurrentlyAvailable(Book[] currentlyAvailable) {
        this.currentlyAvailable = currentlyAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getCurrentlyAvailable(), library.getCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getCurrentlyAvailable());
    }

    @Override
    public String toString() {
        return Arrays.toString(currentlyAvailable);
    }

    /**
     * this method return the name of the book that you want to issued.
     *
     * @param bookName the name of the book.
     */

    public void issueBook(String bookName) {
        System.out.println(bookName + " " + "is  issue for you from the library");
    }
}
