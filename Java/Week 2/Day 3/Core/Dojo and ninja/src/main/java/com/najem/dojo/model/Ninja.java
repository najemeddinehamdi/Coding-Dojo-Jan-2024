package com.najem.dojo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ninjas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Size(min = 2, max = 50, message = "first name must be between 2 and 50")
    private String firstName;
    @NotEmpty
    @Size(min = 2,max = 50,message = "last name must be between 2 and 50")
    private String lastName;
    @NotNull
    @Min(value = 18 ,message = "age must be greater than 18")
    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dojo_id")
    private Dojo dojo;
}
