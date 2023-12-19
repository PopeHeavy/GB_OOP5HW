import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Alex","Vladimir","Griggs");
        controller.createStudent("Billy","Bob","Thornton");
        controller.createStudent("Cillian","Jack","Murphy");
        controller.createStudent("Dick","Bruce","Cheney");

        controller.createTeacher("Edward","John","Redmayne");


        controller.getAllStudents();
        controller.getAllTeachers();

        controller.createGroup();



    }
}