package controller;


import model.*;
import service.*;
import view.*;
import java.util.*;

public class Controller {
    private final DataService dataService = new DataService();

    private final StudentView studentView = new StudentView();

    private final TeacherView teacherView = new TeacherView();

    private final GroupView groupView = new GroupView();

    private final GroupService groupService = new GroupService();

    public void createTeacher(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudents() {
        for (User user : dataService.getAllConcUser(Type.STUDENT)) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void getAllTeachers() {
        for (User user : dataService.getAllConcUser(Type.TEACHER)) {
            teacherView.printOnConsole((Teacher) user);
        }
    }
    public Integer getGroupID() {
        int id;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Group's ID");
        id = scanner.nextInt();
        return id;

    }

    public User getGroupTeacher() {
        int id;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print Teacher's ID");
        id = scanner.nextInt();

        // scanner.close();
        return dataService.getUserById(Type.TEACHER, id);

    }

    public List<User> studentsInGroup() {

        List<User> studentsGroup = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print every student's ID, to exit print -1");

        while (true) {

            int id = scanner.nextInt();

            studentsGroup.add(dataService.getUserById(Type.STUDENT, id));

            if (id == -1) {

                break;
            }

        }

        return studentsGroup;

    }


    public void createGroup() {


        int groupID = getGroupID();
        User teacherGroup = getGroupTeacher();
        List<User> students = studentsInGroup();
        Group group = groupService.createGroup(groupID, teacherGroup, students);
        groupView.printOnConsole(group);

    }

}




