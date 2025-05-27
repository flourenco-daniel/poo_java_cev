//Implementar uma conta bancária

//Jubileu tem uma conta poupança e depositará um valor de 300 reais

//Creuza tem uma conta corrente e depositará um valor de 500 reais
//Creuza vai sacar 100 reais dos 400

//______

//Atributos: +numConta; #tipo(CC ou CP); -dono; -saldo; -status (aberta[V] ou fechada[F]);
//Métodos: +abrirConta(); +fecharConta()(saldo da conta tem que ser == 0); +depositar()(status=V); +sacar()(status=V e valor de saque => saldo); +pagarMensal()(12 reais debitado em CC e 20 reais em CP)
//Métodos especiais: getnumConta(), setnumConta(), getTipo(), setTipo(), getDono(), setDono(), getSaldo(), setSaldo()
//Estados: abriu conta CC = 50 reais de saldo inicial; abriu conta poupança, 150 reais de saldo inicial

package aula05;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    

    public Conta(int n, String t, String d, float s){
        this.numConta = n;
        this.tipo = t;
        this.dono = d;
        this.status = true;
        this.saldo = s;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public int setNumConta(){
        this.numConta = n;
    }

    public String getTipo(){
        return this.getTipo
    }




}
