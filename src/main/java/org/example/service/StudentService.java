package org.example.service;
import org.example.entity.Student;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface StudentService {
    List<Student> getAllStudent();
    void save(Student student);
}
