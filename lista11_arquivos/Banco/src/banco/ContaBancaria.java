package banco;
/**
 *
 * @author humberto.antonelli
 */
public abstract class ContaBancaria {
    
    public static boolean opHabilatada = true;
    
    protected Proprietario proprietario;
    protected double saldo;
    protected String tipo;

    public ContaBancaria(Proprietario proprietario, double saldo, String tipo) {
        this.proprietario = proprietario;
        this.saldo = saldo;
        this.tipo = tipo;
    }
    
    public boolean depositar(double valor) {
        if(!opHabilatada){
            return false;
        }
        
        this.saldo += valor;
        
        return true;
    }
    
    public abstract boolean sacar(double valor);
    
    public abstract void atualizar(double taxa);

    public String getExtrato() {
        
        atualizar(this.getSaldo());
        String r;
        if(this.tipo.equals("1"))
            r = "Conta Poupança";
        else
            r = "Conta Corrente";
        return "Proprietario ===============\n"
                + this.proprietario + "\n"
                + "===========================\n"
                + "Tipo: " + r + "\n"
                + "===========================\n"
                
                + "Saldo: " + this.saldo;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
        
}
