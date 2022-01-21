package online.cafeteria.online.cafeteria.Food;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    public List<Food> getfoodlist() {
        return  List.of(
                new Food(
                        1L,
                        "Chicken",
                        4500
                )
        );

    }
}
