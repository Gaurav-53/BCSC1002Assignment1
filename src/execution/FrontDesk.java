/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_BOOK = 1;
    private static final int RETURN_PREVIOUSLY_ISSUES_BOOK = 2;
    private static final int MY_ISSUES_BOOK = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userinput;
        Student student = new Student();
        Library library = new Library();
        Book book = new Book();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice (1..4):");
            userinput = scanner.nextInt();
            switch (userinput) {
                case ISSUE_BOOK:
                    System.out.println("Enter the name of the book you want to issue:");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    library.issueBook(bookName);
                    break;
                case RETURN_PREVIOUSLY_ISSUES_BOOK:
                    System.out.println("Enter the name of the book that you want to return:");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    student.returnPrevisouslyBook(bookName);
                    break;
                case MY_ISSUES_BOOK:
                    System.out.println("");
                    break;
                default:
            }
        } while (userinput != 4);
        scanner.close();
    }
}
