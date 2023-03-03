public class HelloWorld1 {
    public static void main(String[] args){
       String ambiente = args[0];
        if (ambiente.equals("quente")){
            System.out.print("Calor da porra, está " + ambiente);}
        else {
            System.out.print("Não está quente, está " + ambiente);
        }    
    }
}