public class Main {
    public static void main(String[] args){
        ProdutosLoja meuCombo =  new FabricaCombo();

        BaldePipoca minhaPipoca = meuCombo.criarBalde();
        CopoBebida meuCopo = meuCombo.criarCopo();

        System.out.println("_________Produtos_________");
        System.out.println(minhaPipoca.obterTipobalde());
        System.out.println(meuCopo.obterTipoCopo());
    }
}
