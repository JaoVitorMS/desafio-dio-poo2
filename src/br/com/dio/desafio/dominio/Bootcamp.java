package br.com.dio.desafio.dominio;

import javax.swing.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dateInicial = LocalDate.now();
    private final LocalDate dataFinal = LocalDate.now().plusDays(45);
    private Set<Dev> devInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome () {
        return nome;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public String getDescricao () {
        return descricao;
    }

    public void setDescricao ( String descricao ) {
        this.descricao = descricao;
    }

    public LocalDate getDateInicial () {
        return dateInicial;
    }

    public LocalDate getDataFinal () {
        return dataFinal;
    }

    public Set<Dev> getDevInscritos () {
        return devInscritos;
    }

    public void setDevInscritos ( Set<Dev> devInscritos ) {
        this.devInscritos = devInscritos;
    }

    public Set<Conteudo> getConteudos () {
        return conteudos;
    }

    public void setConteudos ( Set<Conteudo> conteudos ) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dateInicial, bootcamp.dateInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devInscritos, bootcamp.devInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode () {
        return Objects.hash(nome, descricao, dateInicial, dataFinal, devInscritos, conteudos);
    }
}
