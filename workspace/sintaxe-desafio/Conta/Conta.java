public class Conta {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo = 0.0;

    //construtor
    public Conta (){
    }

    public void atualizarSaldo(Double valor){
        this.saldo += valor;
    }

    public String preencherNumeroConta(int num){
        if (num > 0)
        {
            this.setNumero(num);
            return "Numero da conta salvo com sucesso!";
        }
        else
        {
            return "Numero tem que ser maior que zero!";
        }
    }

    public String preencherAgenciaConta(String ag){
        if (!ag.isEmpty())
        {
            this.setAgencia(ag);
            return "Agencia salva com sucesso!";
        } 
        else 
        {
            return "Agencia não pode ser vazia!";
        }  
    }

    public String preencherNomeCliente(String nome){
        if (!nome.isEmpty() && nome.length() > 5)
        {
            this.setNomeCliente(nome);
            return "Nome do cliente salvo com sucesso!";
        } 
        else 
        {
            return "Nome do Cliente não pode ser vazio ou menor que 5 caracteres!";
        }  
    }

    //#region getters and setters
    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    private void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public String getAgencia(){
        return this.agencia;
    }

    private void setNomeCliente(String nomCliente){
        this.nomeCliente = nomCliente;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    private void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }
    //#endregion
}