public class FabricaCombo implements ProdutosLoja{
    @Override
    public BaldePipoca criarBalde() {
        return new BaldeGrande();
    }

    @Override
    public CopoBebida criarCopo() {
        return new CopoGrande();
    }
}
