package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosRealizados = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
    }
    public void progredir(){
        Optional<Conteudo> conteudoOptional = this.conteudosInscritos.stream().findFirst();
        if (conteudoOptional.isPresent()){
            this.conteudosRealizados.add(conteudoOptional.get());
            this.conteudosInscritos.remove(conteudoOptional.get());
        } else {
            System.err.println("Voce não está matriculado!");
        }
    }
    public double calcularTotalXp(){
        return this.conteudosRealizados
                .stream()
                .mapToDouble(conteudo -> conteudo.calcularXp())
                .sum();
    }

    public String getNome () {
        return nome;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos () {
        return conteudosInscritos;
    }

    public void setConteudosInscritos ( Set<Conteudo> conteudosInscritos ) {
        this.conteudosInscritos = conteudosInscritos;
    }

     public Set<Conteudo> getConteudosRealizados () {
        return conteudosRealizados;
    }

    public void setConteudosRealizados ( Set<Conteudo> conteudosRealizados ) {
        this.conteudosRealizados = conteudosRealizados;
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosRealizados, dev.conteudosRealizados);
    }

    @Override
    public int hashCode () {
        return Objects.hash(nome, conteudosInscritos, conteudosRealizados);
    }
}
