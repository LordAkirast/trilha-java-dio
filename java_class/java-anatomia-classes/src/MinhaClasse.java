public class MinhaClasse {

   public static void main (String [] args) {
    System.out.print("Olá! Tudo bem?\n");

    String meuNome = "Daniel";
    String segundoNome = "Rosa";
    int anoDeFabricacao = 2022;
    boolean verdadeira = true;
    anoDeFabricacao = 2018;
    String nomeCompleto = nomeCompleto(meuNome, segundoNome);

    System.out.println(nomeCompleto);

    


    ///tipo nomeDefinido = atribuição

   }


   ////retornar concatenação de strings
   public static String nomeCompleto (String meuNome, String segundoNome) {
    return "Resultado do Método: " + meuNome.concat(" ").concat(segundoNome);
   }
    
}
