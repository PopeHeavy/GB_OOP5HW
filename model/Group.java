package model;

import java.util.List;

public class Group {

    private int groupID;
    private User teacherGroup;
    private List<User> students;

    public Group(int groupID, User teacherGroup, List<User> students) {
        this.teacherGroup = teacherGroup;
        this.students = students;
        this.groupID = groupID;
    }

    public User getTeacherGroup() {
        return teacherGroup;
    }

    public void setTeacherGroup(Teacher teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    @Override
    public String toString() {
        return "groupID="+ groupID +
                teacherGroup +
                ", students:" + students +
                '}';
    }

}