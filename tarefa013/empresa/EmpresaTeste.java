package empresa;

import java.util.ArrayList;

public class EmpresaTeste {
    public void main(String agrs[]) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        String funcionario = "Funcionario";
        String basica = "escola basica";
        String media = "escola media";
        String graduado = "universidade";
        for(int contador = 0; contador < 10; contador++) {
            if(contador == 0 ||contador == 1 || contador == 2 || contador == 3 ) {
                funcionarios.add(new FuncionarioBasico(funcionario + contador, String.valueOf(contador),basica, 1.0, Hierarquia.VENDEDOR));
            } else if (contador == 4 ||contador == 5 || contador == 6) {
                funcionarios.add(new FuncionarioMedio(funcionario + contador, String.valueOf(contador), basica, media, 1.0, Hierarquia.VENDEDOR));
            } else if (contador == 7) {
                funcionarios.add(new FuncionarioMedio(funcionario + contador, String.valueOf(contador), basica, media, 1.0, Hierarquia.SUPERVISOR));
            } else if (contador == 8) {
                funcionarios.add(new FuncionarioGraduado(funcionario + contador, String.valueOf(contador), basica,media, graduado, Hierarquia.SUPERVISOR));
            } else {
                funcionarios.add(new FuncionarioGraduado(funcionario + contador, String.valueOf(contador), basica,media, graduado, Hierarquia.GERENTE));
            }
        }

        Double salarioTotal = 0.0;
        Double salarioBasico = 0.0;
        Double salarioMedio = 0.0;
        Double salarioGraduado = 0.0;
        for(int contador = 0; contador < 10; contador++) {
            salarioTotal = salarioTotal + funcionarios.get(contador).salario;
            if(funcionarios.get(contador) instanceof FuncionarioGraduado) {
                salarioGraduado = salarioGraduado + funcionarios.get(contador).salario;
            } else if (funcionarios.get(contador) instanceof FuncionarioMedio) {
                salarioMedio = salarioMedio + funcionarios.get(contador).salario;
            } else {
                salarioBasico = salarioBasico + funcionarios.get(contador).salario;
            }
        }
    }
}
