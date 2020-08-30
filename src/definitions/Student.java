/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRolNumber;
    private int numberOfBookIssued;
    private Book[] namesOfBookIssued;

    public Student(String firstName, String middleName, String lastName, long universityRolNumber,
                   int numberOfBookIssued, Book[] namesOfBookIssued) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRolNumber = universityRolNumber;
        this.numberOfBookIssued = numberOfBookIssued;
        this.namesOfBookIssued = namesOfBookIssued;
    }

    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUniversityRolNumber() {
        return universityRolNumber;
    }

    public void setUniversityRolNumber(long universityRolNumber) {
        this.universityRolNumber = universityRolNumber;
    }

    public int getNumberOfBookIssued() {
        return numberOfBookIssued;
    }

    public void setNumberOfBookIssued(int numberOfBookIssued) {
        this.numberOfBookIssued = numberOfBookIssued;
    }

    public Book[] getNamesOfBookIssued() {
        return namesOfBookIssued;
    }

    public void setNamesOfBookIssued(Book[] namesOfBookIssued) {
        this.namesOfBookIssued = namesOfBookIssued;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", universityRolNumber=" + universityRolNumber +
                ", numberOfBookIssued=" + numberOfBookIssued +
                ", namesOfBookIssued=" + Arrays.toString(namesOfBookIssued) +
                '}';
    }
}
