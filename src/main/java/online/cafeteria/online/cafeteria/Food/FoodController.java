package online.cafeteria.online.cafeteria.Food;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import online.cafeteria.online.cafeteria.student.Student;
import online.cafeteria.online.cafeteria.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/cafe/student/food")
public class FoodController {

    private final  FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @Operation(summary = "api/cafe/student/food", description = "get a list of food", tags = "Get")
    @ApiResponses(value = {
            @ApiResponse(responseCode ="200", description = "prints food name and amount",

                    content = {@Content(mediaType = "application/json",

                            schema = @Schema(implementation = FoodService.class))}),
            @ApiResponse(responseCode = "404", description = "whitelabel",
                    content = @Content)
    })

    @GetMapping
    public List<Food> getFood() {
        return  foodService.getfoodlist();
    }
}
