package online.cafeteria.online.cafeteria.student;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/cafe/student")
public class StudentsController {

    private final StudentService studentService;

    @Autowired
    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }
    @Operation(summary = "api/cafe/student", description = "get a list of students", tags = "Get")
    @ApiResponses(value = {
            @ApiResponse(responseCode ="200", description = "prints student name,id and email",

                    content = {@Content(mediaType = "application/json",

                            schema = @Schema(implementation = StudentService.class))}),
            @ApiResponse(responseCode = "404", description = "whitelabel",
                    content = @Content)
    })

    @GetMapping
    public List<Student> getStudent() {
        return  studentService.getStudent();
    }
}
