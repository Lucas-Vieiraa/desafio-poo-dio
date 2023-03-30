import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
       cursoJava.inserirCurso("Curso Java","Descrição de Java", 8);

        Curso cursoJs = new Curso();
        cursoJs.inserirCurso("Curso Js","Descrição de Js", 4);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.inserirMentoria("Mentoria de Java","Descrição Mentoria de Java");
        Mentoria mentoriaJs = new Mentoria();
        mentoriaJs.inserirMentoria("Mentoria de Js","Descrição Mentoria de Js");

        System.out.println(cursoJava);
        System.out.println(cursoJs);
        System.out.println(mentoriaJava);
        System.out.println(mentoriaJs);


        cursoJava.removerCurso();
        System.out.println(cursoJava);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJs);
        bootcamp.getConteudos().add(mentoriaJava);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Banco Pan Developer");
        bootcamp1.setDescricao("Descrição Bootcamp JavaScript Developer");
        bootcamp1.getConteudos().add(cursoJs);
        bootcamp1.getConteudos().add(mentoriaJs);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.desinscreverBootcamp(bootcamp);
        devCamila.desinscreverBootcamp(bootcamp);
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());


        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());


    }

}
