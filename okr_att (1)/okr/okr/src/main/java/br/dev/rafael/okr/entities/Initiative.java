package br.dev.rafael.okr.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Initiative {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private Double porcentagemConclusao;

    @ManyToOne
    @JoinColumn(name = "key_result_id")
    @JsonBackReference
    private KeyResult keyResult;
}