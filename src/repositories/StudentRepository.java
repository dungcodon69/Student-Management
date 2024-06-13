package repositories;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private static final String PATH = "src/data/student.csv";

    public List<Student> getAll(){
        List<Student> students = readFile();
        return students;
    }

    public boolean addStudent(Student student){
        List<Student> students = getAll();
        int lastId = students.get(students.size()-1).getStudentCode();
        student.setStudentCode(lastId+1);
        try {
            writeFile(student);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    private void writeFile(Student student) throws IOException {
        FileWriter fileWriter = new FileWriter("PATH",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String p = student.toString();
        bufferedWriter.write(student.toString());
        bufferedWriter.flush();
        bufferedWriter.close();
    }


    public List<Student> readFile(){
        List<Student> students = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] split = line.split(",");
                students.add(new Student(split[1],split[3],Boolean.parseBoolean(split[5]),split[4],Integer.parseInt(split[0]),split[2]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return students;
    }


}
