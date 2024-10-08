public class Conta {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    //construtor
    public Conta (){
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