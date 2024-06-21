package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso () {}

    @Override
    public double calcularXp () {
        return XP_PADRAO + 20d;
    }

    public int getCargaHoraria () {
        return cargaHoraria;
    }

    public void setCargaHoraria ( int cargaHoraria ) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString () {
        return "titulo = " + getTitulo() + ", descricao = " + getDescricao() + ", carga horária = " + cargaHoraria;
    }
}




