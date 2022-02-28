package br.com.desafiopoo;


import br.com.desafiopoo.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java ");
        curso.setDescricao("Descrição curso Java ");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Python ");
        curso1.setDescricao("Descrição curso Python ");
        curso1.setCargaHoraria(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Git ");
        curso2.setDescricao("Descrição curso Git ");
        curso2.setCargaHoraria(5);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudoSet().add(curso);
        bootcamp.getConteudoSet().add(curso1);
        bootcamp.getConteudoSet().add(curso2);
        bootcamp.getConteudoSet().add(mentoria);


        Dev dev = new Dev();
        dev.setNome("Gustavo O Cardozo");
        dev.inscreverBootCampo(bootcamp);
        System.out.println(dev.getConteudoInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println(dev.getConteudoConcluidos());
        System.out.println(dev.calcularXp());
        System.out.println(dev.getConteudoInscritos());



        System.out.println("\n");




        Dev dev1 = new Dev();
        dev1.inscreverBootCampo(bootcamp);
        dev1.setNome("Elaine Paganini");
        System.out.println(dev1.getConteudoInscritos());
        dev1.progredir();
        System.out.println(dev1.getConteudoConcluidos());
        System.out.println(dev1.calcularXp());
        System.out.println(dev1.getConteudoInscritos());


    }

}
