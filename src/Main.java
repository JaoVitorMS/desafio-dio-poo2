import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main ( String[] args ) {
        Curso dio = new Curso();
        dio.setTitulo("Curso dio");
        dio.setDescricao("POO em java");
        dio.setCargaHoraria(180);
        Curso dio2 = new Curso();
        dio.setTitulo("Curso dio");
        dio.setDescricao("POO em pytohn");
        dio.setCargaHoraria(200);

        Mentoria mentor = new Mentoria();
        mentor.setTitulo("Spooky Houses");
        mentor.setDescricao("Aula sobre o budismo tibetano");
        mentor.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Boot de java");
        bootcamp.setDescricao("Vejaa");
        bootcamp.getConteudos().add(dio);
        bootcamp.getConteudos().add(mentor);
        bootcamp.getConteudos().add(dio2);

        Dev devJao = new Dev();
        devJao.setNome("João");
        devJao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos por "+devJao.getNome()+ ": " +devJao.getConteudosInscritos());
        devJao.progredir();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Conteudos inscritos por "+devJao.getNome()+ ": " +devJao.getConteudosInscritos());
        System.out.println("Conteudos realizados: " + devJao.getConteudosRealizados());
        System.out.println("XP: "+devJao.calcularTotalXp());

        Dev devGuido = new Dev();
        devGuido.setNome("Guido");
        devGuido.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos por "+devGuido.getNome()+ ": " +devGuido.getConteudosInscritos());
        devGuido.progredir();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Conteudos inscritos por "+devGuido.getNome()+ ": " +devGuido.getConteudosInscritos());
        System.out.println("Conteudos realizados: " + devJao.getConteudosRealizados());
        devGuido.progredir();
        System.out.println("XP: "+ devGuido.calcularTotalXp());System.out.println("XP: "+ devGuido.calcularTotalXp());

    }
}
