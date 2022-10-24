package tech.devinhouse.exercicio01e02.models;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class Tutor {

    private static int SEQUENCIA = 0;


    private Integer id;
    private String nome;
    private Integer idade;

    public Tutor() {
        this.id = generateId();
    }


    public Tutor(Integer id, String nome, Integer idade) {
        this.id = generateId();
        this.nome = nome;
        this.idade = idade;
    }


    private Integer generateId() {
        return ++SEQUENCIA;
    }

}