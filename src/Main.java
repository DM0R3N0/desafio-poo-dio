import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descri??oo curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descri??oo curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descri??o mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descri??o Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conte?dos Inscritos Daniel:" + devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        devDaniel.progredir();
        System.out.println("-");
        System.out.println("Conte?dos Inscritos Daniel:" + devDaniel.getConteudosInscritos());
        System.out.println("Conte?dos Conclu?dos Daniel:" + devDaniel.getConteudosConcluidos());
        System.out.println("XP:" + devDaniel.calcularTotalXp());

        System.out.println("-------");

        Dev devSimone = new Dev();
        devSimone.setNome("Simone");
        devSimone.inscreverBootcamp(bootcamp);
        System.out.println("Conte?dos Inscritos Simone:" + devSimone.getConteudosInscritos());
        devSimone.progredir();
        devSimone.progredir();
        devSimone.progredir();
        System.out.println("-");
        System.out.println("Conte?dos Inscritos Simone:" + devSimone.getConteudosInscritos());
        System.out.println("Conte?dos Concluidos Simone:" + devSimone.getConteudosConcluidos());
        System.out.println("XP:" + devSimone.calcularTotalXp());

    }

}
