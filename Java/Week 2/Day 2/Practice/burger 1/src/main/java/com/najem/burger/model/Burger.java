package com.najem.burger.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "burger")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Burger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty
    @Size(min = 2, max = 200 , message = "burger name must be between 2 and 200")
    private String burgerName;
    @NotEmpty
    @Size(min = 2, max = 200,message = "restaurant name must be between 2 and 200")
    private String restaurantName;
    @NotEmpty
    @Max(value = 5 ,message = "rating must be between 0 and 5")
    private String rating;
    @NotEmpty
    @Size(min = 2, max = 200,message = "notes must be between 2 and 200")
    private String notes;

}
