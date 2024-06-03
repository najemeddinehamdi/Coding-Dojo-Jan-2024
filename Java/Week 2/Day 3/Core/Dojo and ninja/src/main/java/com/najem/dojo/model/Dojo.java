package com.najem.dojo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "dojos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Dojo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Size(min = 2, max = 50, message = "name must be between 2 and 50")
    private String name;
    @OneToMany(mappedBy = "dojo" ,fetch = FetchType.LAZY)
    private List<Ninja> ninjas;
}
