package online.cafeteria.online.cafeteria.Food;

import javax.persistence.*;

@Entity
@Table(name = "food")
public class Food {

    @Id
    @SequenceGenerator(
            name= "food_sequence",
            sequenceName = "food_sequence",
            allocationSize= 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "food_sequence"
    )
    private Long id;
    private String name;
    private Integer amount;

    public Food() {
    }


    public Food(Long id, String name, Integer amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
