import java.time.LocalDate;

import simuladorbootcamp.Bootcamp;
import simuladorbootcamp.Curso;
import simuladorbootcamp.Dev;
import simuladorbootcamp.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso python");
        curso2.setDescricao("descrição curso python");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devI = new Dev();
        devI.setNome("DevI");
        devI.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos DevI:" + devI.getConteudosInscritos());
        devI.progredir();
        devI.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos DevI:" + devI.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos DevI:" + devI.getConteudosInscritos());
        System.out.println("XP:" + devI.calcularTotalXp());

        System.out.println("-------");

        Dev devII = new Dev();
        devII.setNome("DevII");
        devII.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos DevII:" + devII.getConteudosInscritos());
        devII.progredir();
        devII.progredir();
        devII.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos DevII:" + devII.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos DevII:" + devII.getConteudosInscritos());
        System.out.println("XP:" + devII.calcularTotalXp());

    }
    
}
