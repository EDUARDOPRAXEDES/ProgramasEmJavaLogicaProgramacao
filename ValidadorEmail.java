public class ValidadorEmail{
    public static void main(String[] args) {
        boolean emailEduardo = ValidarEmail("eduardo@interdata.com.br");
        System.out.println("Teste de email Eduardo: " + emailEduardo);
        
        boolean emailLaura = ValidarEmail("laura@nterdata.com.br");
        System.out.println("Teste de email Laura: "+ emailLaura);  

        

    }
    public static boolean ValidarEmail(String email){
    return email.contains("@interdata.com.br");
    }
}



