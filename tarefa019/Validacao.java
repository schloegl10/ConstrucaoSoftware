public class Validacao {
    static boolean validaNome(String nome) {
        return nome.matches("^[a-zA-Z]{5,100}$");
    }

    static boolean validaCpf(String cpf) {
        if (cpf.length() != 11) {
            return(false);
        }
        String digto10;
        String digto11;
        int soma;
        int resto;
        int numeroAtual;
        int peso;
        try {
            soma = 0;
            peso = 10;
            for (int i = 0; i < 9; i++) {
                numeroAtual = Character.getNumericValue(cpf.charAt(i));
                soma = soma + (numeroAtual * peso);
                peso = peso - 1;
            }

            resto = 11 - (soma % 11);
            if ((resto == 10) || (resto == 11)) {
                digto10 = "0";
            } else {
                digto10 = Integer.toString(resto);
            } 

            soma = 0;
            peso = 11;
            for(int i = 0; i < 10; i++) {
                numeroAtual = Character.getNumericValue(cpf.charAt(i));
                soma = soma + (numeroAtual * peso);
                peso = peso - 1;
            }

            resto = 11 - (soma % 11);
            if ((resto == 10) || (resto == 11)) {
                digto11 = "0";
            } else {
                digto11 = Integer.toString(resto);
            } 

            if ((digto10.charAt(0) == cpf.charAt(9)) && (digto11.charAt(0) == cpf.charAt(10))) {
                 return true;
            } else {
                return false;
            } 
        } catch (Exception e) {
            return false;
        }
    }
    static boolean validaSenha(String senha) {
        return senha.matches("^[a-zA-Z0-9!@#&-=_]{5,}$");
    }

    public static void main(String[] args) {
        //nome
        //mais de 100
        boolean valida = validaNome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(valida);
        //menos de 5
        valida = validaNome("aa");
        System.out.println(valida);
        //acentuacao
        valida = validaNome("aaaaaaaã");
        System.out.println(valida);
        //acentuacao
        valida = validaNome("aaaaaaa$");
        System.out.println(valida);
        //correta
        valida = validaNome("aaaaaaa");
        System.out.println(valida);
        //senha
        //correta
        valida = validaSenha("aaaaaaa");
        System.out.println(valida);
        //menos de 5
        valida = validaNome("aa");
        System.out.println(valida);
        //acentuacao
        valida = validaNome("aaaaaaaã");
        System.out.println(valida);
        //espaço
        valida = validaNome("aa aaaaa");
        System.out.println(valida);
        //cpf
        valida = validaCpf("29143115080");
        System.out.println(valida);
    }
}
