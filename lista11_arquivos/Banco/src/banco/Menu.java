package banco;

/**
 *
 * @author humberto.antonelli
 */
public enum Menu {
    
    CRIAR(1, "Criar conta"),
    SACAR(2, "Sacar"),
    DEPOSITAR(3, "Depositar"),
    EXTRATO(4, "Extrato"),
    GERENCIAR(5, "Área do Gerente"),
    SAIR(6, "Sair");
    
    private int codigo;
    private String operacao;
    
    Menu(int codigo, String operacao){
        this.codigo = codigo;
        this.operacao = operacao;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getOperacao() {
        return this.operacao;
    }
    
    public static Menu findByCodigo(String codigo) {
        for(Menu opcao : values()){
            //if (codigo.equals(String.valueOf(opcao.getCodigo()))){
            if (codigo.equals(opcao.getCodigo() + "")) {
                return opcao;
            }
        }
        return null;
    }
    
}
