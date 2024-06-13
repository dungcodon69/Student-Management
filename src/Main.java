import model.Student;
import services.IService;
import services.StudentService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IService<Student> service = new StudentService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Management System---");
        int choice = -1;
        System.out.println("1. Add new a student");
        System.out.println("2. Delete a student");
        System.out.println("3. View list students");
        System.out.println("4. Search student");
        while (true){
            System.out.println("Enter your choice: ");
//            try{
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("---Add student---");
                        System.out.println("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter DOB: ");
                        String dob = scanner.nextLine();
                        System.out.println("Enter gender (1-Male, 0-Female)");
                        boolean gender = Boolean.parseBoolean(scanner.nextLine());
                        System.out.println("Enter phone number: ");
                        String phoneNumber = scanner.nextLine();
                        System.out.println("Enter class code: ");
                        String classCode = scanner.nextLine();
                        Student student = new Student(name,dob,gender,phoneNumber,classCode);
                        service.add(student);
                        //service.checkStudentInput(student);
                        break;
                    case 2:
                        break;
                    case 3:
                        System.out.println("---List Students---");
                        List<Student> students = service.view();
                        for (Student s : students){
                            System.out.println("ID: " + s.getStudentCode() + " Name: " + s.getName() + " DOB: " + s.getDob() + " Gender: " + (s.isGender() ? "Male" : "Female" + " Class Name: " + s.getClassCode()));
                        }
                        System.out.println("--------------");
                        break;
                    case 4:
                        System.out.println("case 4");
                        break;
                    case 0:
                        System.out.println("Exit!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Not a valid option. Please try again!");
                        break;
                }
//            } catch (NumberFormatException e){
//                System.out.println("The input must be a number. Please try again!");
//            }
        }
    }
}
