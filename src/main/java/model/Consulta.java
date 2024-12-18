package model;

import lombok.Data;

import java.util.List;

@Data
public class Consulta {
    private int codigo;
    private String data;
    private String periodo;
    private int veterinario_id;
    private String nome_vet;
    private String motivo;
    private String status;
    private String observacoes;
    private String resultados;
    private int tratamento_id;
    private List<Exame> exames;
}
