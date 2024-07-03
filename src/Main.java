import java.time.LocalDate;

import com.br.dio.desafio.dominio.Bootcamp;
import com.br.dio.desafio.dominio.Curso;
import com.br.dio.desafio.dominio.Dev;
import com.br.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());
        
       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Develooper");
       bootcamp.setDescricao(("Descrição Bootcamp Java Developer"));
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);

       Dev devCamila = new Dev();
       devCamila.setNome("Camila");
       devCamila.increverBootcamp(bootcamp);
       System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudoInscritos());
       devCamila.progredir();
       devCamila.progredir();
       System.out.println("-");
       System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudoInscritos());
       System.out.println("Conteudos inscritos Camila:" + devCamila.getConteudoConcluidos());
       System.out.println("XP: " + devCamila.calcularXp());

       System.out.println("");
       System.out.println("----------------");
       System.out.println("");

       Dev devEric = new Dev();
       devEric.setNome("Eric");
       devEric.increverBootcamp(bootcamp);
       System.out.println("Conteudos inscritos Eric: " + devEric.getConteudoInscritos());
       devEric.progredir();
       devEric.progredir();
       devEric.progredir();
       System.out.println("-");
       System.out.println("Conteudos inscritos Eric: " + devEric.getConteudoInscritos());
       System.out.println("Conteudos inscritos Eric: " + devEric.getConteudoConcluidos());
       System.out.println("XP: " + devEric.calcularXp());
    }
}
