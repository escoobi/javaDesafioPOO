package br.com.desafiopoo.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial =  LocalDate.now();
    private final LocalDate dataFinal =  dataInicial.plusDays(45);
    private Set<Dev> devSetInscritor = new HashSet<>();
    private Set<Conteudo> conteudoSet = new LinkedHashSet<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevSetInscritor() {
        return devSetInscritor;
    }

    public void setDevSetInscritor(Set<Dev> devSetInscritor) {
        this.devSetInscritor = devSetInscritor;
    }

    public Set<Conteudo> getConteudoSet() {
        return conteudoSet;
    }

    public void setConteudoSet(Set<Conteudo> conteudoSet) {
        this.conteudoSet = conteudoSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return nome.equals(bootcamp.nome) && descricao.equals(bootcamp.descricao) && dataInicial.equals(bootcamp.dataInicial) && dataFinal.equals(bootcamp.dataFinal) && devSetInscritor.equals(bootcamp.devSetInscritor) && conteudoSet.equals(bootcamp.conteudoSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devSetInscritor, conteudoSet);
    }


}
