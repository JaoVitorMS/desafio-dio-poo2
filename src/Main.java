import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main ( String[] args ) {
        Curso dio = new Curso();
        dio.setTitulo("Curso dio");
        dio.setDescricao("POO em java");
        dio.setCargaHoraria(180);

        Mentoria mentor = new Mentoria();
        mentor.setTitulo("Spooky Houses");
        mentor.setDescricao("Aula sobre o budismo tibetano");
        mentor.setData(LocalDate.now());


    }
}
