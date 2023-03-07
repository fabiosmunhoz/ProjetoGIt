public class PrimeiraClasse {
    public static void main(String[] args) {
        /**
         * informacoes do mentos
         */
        MentosPureFresh mentos = new MentosPureFresh();
        mentos.setEmbalagem("azul");
        mentos.setDentroValidade(true);
        mentos.setIngredientes("Goma base, Maltodextrina e Óleo vegetal");
        mentos.setPeso(92);
        mentos.setSabor("Fresh Mint");
        mentos.setQuantidade(46);
        mentos.setSemAcucar(true);
        /**
         * Impressao das informacoes do mentos
         */
        System.out.println("Sabor: " + mentos.getSabor());
        System.out.println("Ingredientes: " + mentos.getIngredientes());
        System.out.println("Peso: " + mentos.getPeso() + "g");
        System.out.println("Quantidade: " + mentos.getQuantidade() + " Unidades");
        if (mentos.isSemAcucar()== true){
        System.out.println("Sem acucar");}
        else {
            System.out.println("Com acucar");
        }
        if (mentos.isDentroValidade() == true){
            System.out.println("Dentro da validade");}
        else {
            System.out.println("Vencido");
        }


    }
}
