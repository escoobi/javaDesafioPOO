package br.com.desafiopoo.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;


    @Override
    public double calcularXp() {
        return xpPadrao + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo= " + getTitulo() +
                "descricao= " + getDescricao() +
                "data=" + data +
                '}';
    }
}
