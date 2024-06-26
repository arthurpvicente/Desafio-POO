package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {

        // Define o formato de data brasileira
        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formata a data usando o formato brasileiro
        String dataFormatada = data != null ?  data.format(formatoBrasileiro) : "Data não informada";



        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + dataFormatada +
                '}';
    }
}