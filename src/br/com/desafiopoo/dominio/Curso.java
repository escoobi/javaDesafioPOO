package br.com.desafiopoo.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return xpPadrao * cargaHoraria;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo=" + getTitulo() +
                "descricao=" + getDescricao() +
                "cargaHoraria=" + cargaHoraria +
                '}';
    }
}
