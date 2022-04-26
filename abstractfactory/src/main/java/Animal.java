public class Animal {
    private Ficha ficha;
    private  Cadastro cadastro;

    public Aluno (FabricaAbstrata fabrica) {
        this.ficha = fabrica.createFicha();
        this.cadastro = fabrica.createCadastro();
    }

    public String emitirFicha() {
        return this.ficha.emitir();
    }

    public String emitirCadastro() {
        return this.cadastro.emitir();
    }
}
