package model;

public class Teacher extends User{
    private int teacherID;

    public Teacher(String firstName, String secondName, String lastName, int id) {
        super(firstName, secondName, lastName);
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }
    @Override
    public java.lang.String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", firstName=" +super.getFirstName() +
                ", secondName=" +super.getSecondName() +
                ", lastName=" +super.getLastName() +
                '}';
    }
}
