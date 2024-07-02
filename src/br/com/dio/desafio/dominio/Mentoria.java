package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalTime;

public static class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public  double calcularXp() {
        return XP_PADRAO + 200;
    }
    public Mentoria() {
    }
}

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

