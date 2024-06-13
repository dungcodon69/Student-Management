package services;

import java.util.List;

public interface IService<T> {
    List<T> view();


    String checkStudentInput(T person);

    boolean add(T student);
}
