package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java script");
        curso2.setDescricao("descrição curso java script");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devFernando = new Dev();
        devFernando.setNome("Fernando");
        devFernando.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Fernando:" + devFernando.getConteudosInscritos());
        devFernando.progredir();
        devFernando.progredir();
        System.out.println("Conteudos concluidos Fernando:" + devFernando.getConteudosConcluidos());
        System.out.println("XP Fernando  " + devFernando.calcularXp());

        System.out.println("_________");

        Dev devKarina = new Dev();
        devKarina.setNome("Karina");
        devKarina.inscreverBootcamp(bootcamp);
        devKarina.progredir();
        System.out.println("Conteudos inscritos Karina:" + devKarina.getConteudosInscritos());
        System.out.println("Conteudos concluidos Karina:" + devKarina.getConteudosConcluidos());
        System.out.println("XP Karina " + devKarina.calcularXp());


    }
}
