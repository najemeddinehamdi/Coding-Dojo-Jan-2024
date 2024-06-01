package com.najem.travels.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "travels")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Travels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Size(min = 2,max = 50 ,message = "Expence must be between 2 and 50")
    private String expense;
    @NotEmpty
    @Size(min = 2,max = 50 ,message = "vendor must be between 2 and 50")
    private String vendor;
    @NotNull
    @Min(value = 50 ,message = "amount must be between greater than 50")
    private String amount;
    @NotEmpty
    @Size(min = 2,max = 200 ,message = "description must be between 2 and 200")
    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }

}
