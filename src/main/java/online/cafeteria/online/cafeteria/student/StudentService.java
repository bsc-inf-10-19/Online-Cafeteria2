package online.cafeteria.online.cafeteria.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "YAMIKANI",
                        "yAMIE24@gmail.com"
                )
        );

    }
}
