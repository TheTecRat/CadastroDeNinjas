package dev.java10x.CadastroDeNinjas.Missoes;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    //Uma missao pode ter muitos ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;
}
