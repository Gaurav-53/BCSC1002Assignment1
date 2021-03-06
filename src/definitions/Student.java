/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRolNumber() == student.getUniversityRolNumber() &&
                getNumberOfBookIssued() == student.getNumberOfBookIssued() &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getMiddleName(), student.getMiddleName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Arrays.equals(getNamesOfBookIssued(), student.getNamesOfBookIssued());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstName(), getMiddleName(), getLastName(), getUniversityRolNumber(), getNumberOfBookIssued());
        result = 31 * result + Arrays.hashCode(getNamesOfBookIssued());
        return result;
    }

    /**
     * This method return the name of the book that you want to return.
     *
     * @param bookName1 the name of the book that you return.
     */

    public void returnPrevisouslyBook(String bookName1) {
        System.out.println(bookName1 + " " + "is return");
    }

    public void yourFirstName(String firstName) {
    }
}
