package br.com.gilmar;

import org.junit.*;

public class AvaliacaoTest {
    private Avaliacao avaliacao;

    @Before
    public void setup() {
        avaliacao = new Avaliacao();
    }

    // R1 - 0 <= cargaHoraria
    @Test
    public void testCargaHorariaNegativa() {
        double nota1 = 1;
        double nota2 = 1;
        double faltas = 1;
        double cargaHoraria = -1;
        Exception exception = new Exception();
        try {
            avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {
            exception = e;
        }

        // System.out.println(valorDesconto);
        Assert.assertEquals("Valores Inválidos.", exception.getMessage());
    }

    // R2 - 0 <= faltas <= cargaHoraria
    @Test
    public void testFaltasMenorQueZero() {
        double nota1 = 1;
        double nota2 = 1;
        double faltas = -1;
        double cargaHoraria = 10;
        Exception exception = new Exception();
        try {
            avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {
            exception = e;
        }

        // System.out.println(valorDesconto);
        Assert.assertEquals("Valores Inválidos.", exception.getMessage());
    }

    // R2 - 0 <= faltas <= cargaHoraria
    @Test
    public void testFaltasMaiorQueCarga() {
        double nota1 = 1;
        double nota2 = 1;
        double faltas = 10;
        double cargaHoraria = 1;
        Exception exception = new Exception();
        try {
            avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {
            exception = e;
        }

        // System.out.println(valorDesconto);
        Assert.assertEquals("Valores Inválidos.", exception.getMessage());
    }

    // R3 - 0 <= nota1 <= 10
    @Test
    public void testNota1MenorQueZero() {
        double nota1 = -1;
        double nota2 = 1;
        double faltas = 1;
        double cargaHoraria = 10;
        Exception exception = new Exception();
        try {
            avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {
            exception = e;
        }

        // System.out.println(valorDesconto);
        Assert.assertEquals("Valores Inválidos.", exception.getMessage());
    }

    // R3 - 0 <= nota1 <= 10
    @Test
    public void testNota1MaiorQueDez() {
        double nota1 = 11;
        double nota2 = 1;
        double faltas = 1;
        double cargaHoraria = 10;
        Exception exception = new Exception();
        try {
            avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {
            exception = e;
        }

        // System.out.println(valorDesconto);
        Assert.assertEquals("Valores Inválidos.", exception.getMessage());
    }

    // R4 - 0 <= nota2 <= 10
    @Test
    public void testNota2MenorQueZero() {
        double nota1 = 1;
        double nota2 = -1;
        double faltas = 1;
        double cargaHoraria = 10;
        Exception exception = new Exception();
        try {
            avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {
            exception = e;
        }

        // System.out.println(valorDesconto);
        Assert.assertEquals("Valores Inválidos.", exception.getMessage());
    }

    // R4 - 0 <= nota2 <= 10
    @Test
    public void testNota2MaiorQueDez() {
        double nota1 = 1;
        double nota2 = 11;
        double faltas = 1;
        double cargaHoraria = 10;
        Exception exception = new Exception();
        try {
            avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {
            exception = e;
        }

        // System.out.println(valorDesconto);
        Assert.assertEquals("Valores Inválidos.", exception.getMessage());
    }

    // R5 - Se quantidade de faltas for superior a 25% da carga horária, o aluno
    // está reprovado por faltas;
    @Test
    public void testReprovadoFalta() {
        double nota1 = 7;
        double nota2 = 7;
        double faltas = 26;
        double cargaHoraria = 100;
        String resultado = "";
        try {
            resultado = avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {}

        // System.out.println(valorDesconto);
        Assert.assertEquals("Reprovado por Falta.", resultado);
    }

    //R6 -> Se a média final for menor que 3, o aluno está reprovado por média;
    @Test
    public void testReprovadoMediaMenorTrez() {
        double nota1 = 2;
        double nota2 = 2;
        double faltas = 20;
        double cargaHoraria = 100;
        String resultado = "";
        try {
            resultado = avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {}

        // System.out.println(valorDesconto);
        Assert.assertEquals("Reprovado por Média.", resultado);
    }

    //R7 -> Se a média estiver entre 3 e 6, o aluno terá direito a uma prova extra;
    @Test
    public void testProvaExtra() {
        double nota1 = 4;
        double nota2 = 4;
        double faltas = 20;
        double cargaHoraria = 100;
        String resultado = "";
        try {
            resultado = avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {}

        // System.out.println(valorDesconto);
        Assert.assertEquals("Prova Extra.", resultado);
    }

    //R7 -> Se a média estiver entre 3 e 6, o aluno terá direito a uma prova extra;
    @Test
    public void testProvaExtra2() {
        double nota1 = 3;
        double nota2 = 3;
        double faltas = 20;
        double cargaHoraria = 100;
        String resultado = "";
        try {
            resultado = avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {}

        // System.out.println(valorDesconto);
        Assert.assertEquals("Prova Extra.", resultado);
    }

    // R8 - Se quantidade de faltas for superior a 25% da carga horária, o aluno
    // está reprovado por faltas;
    @Test
    public void testAprovado1() {
        double nota1 = 6;
        double nota2 = 6;
        double faltas = 1;
        double cargaHoraria = 10;
        String resultado = "";
        try {
            resultado = avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {}

        // System.out.println(valorDesconto);
        Assert.assertEquals("Aprovado.", resultado);
    }

    // R8 - Se quantidade de faltas for superior a 25% da carga horária, o aluno
    // está reprovado por faltas;
    @Test
    public void testAprovado2() {
        double nota1 = 7;
        double nota2 = 7;
        double faltas = 1;
        double cargaHoraria = 10;
        String resultado = "";
        try {
            resultado = avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {}

        // System.out.println(valorDesconto);
        Assert.assertEquals("Aprovado.", resultado);
    }

}
