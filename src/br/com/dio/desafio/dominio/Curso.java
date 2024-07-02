package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int CargaHoraria;

    public Curso() {
    }
}

    @Override
    public int CalcularXp(){

        return XP_PADRAO * CargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo + '\'' +
                ", descricao='" + getDescricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

