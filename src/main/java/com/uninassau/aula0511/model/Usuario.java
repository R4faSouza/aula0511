package com.uninassau.aula0511.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name = "usarios")
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Nome é Obrigatorio")
    private String nome;
    @Email(message = "Email deve ser valido")
    @NotBlank(message = "Email obrigatorio")
    private String email;

    @Min(value =18, message= "Idade minima 18")
    private int idade;

}
