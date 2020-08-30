/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String numberISBN;

    public Book() {
        bookName = "Let us Java";
        authorName = "Yashavant";
        numberISBN = "34567892378654";
    }

    public Book(String bookName, String authorName, String numberISBN) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.numberISBN = numberISBN;
    }

    /**
     * This method returns the name of the book.
     *
     * @return The name of the book.
     */

    public String getName() {
        return " ";
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getNumberISBN() {
        return numberISBN;
    }

    public void setNumberISBN(String numberISBN) {
        this.numberISBN = numberISBN;
    }

    public String toString() {
        return String.format(
                "Book Name: %s,Author Name: %s,ISBN Number: %s",
                getBookName(), getAuthorName(), getNumberISBN()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(this.getBookName(), book.getBookName()) &&
                Objects.equals(this.getAuthorName(), book.getAuthorName()) &&
                Objects.equals(this.getNumberISBN(), book.getNumberISBN());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getNumberISBN());
    }
}
