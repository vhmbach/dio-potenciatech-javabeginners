package edu.vitor.segundasemana;
public class MinhaClasse3 {
    public static void main (String[] args) {
        String primeiroNome = "Vitor";
        String segundoNome = "Bach";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
