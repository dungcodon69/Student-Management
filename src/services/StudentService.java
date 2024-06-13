package services;
import model.Student;
import repositories.StudentRepository;
import services.IService;

import java.util.List;

public class StudentService implements IService<Student> {
    StudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student> view() {
        return studentRepository.getAll();
    }

    @Override
    public String checkStudentInput(Student student) {
        return "";
    }

    @Override
    public boolean add(Student student) {
        studentRepository.addStudent(student);
        return true;
    }
}
