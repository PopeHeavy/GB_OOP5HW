package model;

public class Student extends User{

    private int studentID;

    public Student(String firstName, String secondName, String lastName, int studentID) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public java.lang.String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName=" +super.getFirstName() +
                ", secondName=" +super.getSecondName() +
                ", lastName=" +super.getLastName() +
                '}';
    }
}
