package com.example.employeedemo.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "codDipartimento"
)
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Dipartimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_dipartimento")
    private Long codDipartimento;
    private String denominazione;
    private String citta;

//    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dipartimento", orphanRemoval = true,fetch = FetchType.LAZY)
    private List<Employee> impiegati = new ArrayList<>();


}
