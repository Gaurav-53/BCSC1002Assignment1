/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;

public class FrontDesk {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("Let us Java ");
        book.setAuthorName("Yashavant Kanetkar");
        book.setNumberISBN("9789388176385");
        System.out.println(book.getBookName());
        System.out.println(book.getAuthorName());
        System.out.println(book.getNumberISBN());

    }
}
