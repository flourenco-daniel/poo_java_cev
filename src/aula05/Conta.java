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

public final class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    
    public void estadoAtual() {
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Tipo de conta: " + this.getTipo());
        if(this.getStatus()) {System.out.println("Sua conta está aberta!");}
        else {System.out.println("Sua conta está fechada");}

    }

    public void abrirConta(String t) {
        this.setStatus(true);
        this.setTipo(t);
        if("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta() {
          if(this.getSaldo() > 0) {
            System.out.println("Saldo positivo, impossível fechar a conta");
            }
            else if(this.getSaldo() < 0) {
            System.out.println("Conta em débito. Impossível fechar");
            }
            else {this.setStatus(false); 
                System.out.println("Conta fechada com sucesso!");}         
        
    }

    public void depositar(float v) {
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta de: " + this.getDono());
        }
            else {System.out.println("Impossível depositar em uma conta inativa");
        }
    }

    public void sacar(float v){
        if(this.getStatus()) {
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso");
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Conta inexistente");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } 
        else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso");
        } else {System.out.println("Impossível pagar a mensalidade.");}

    }

    
    public void status() {

    }


    //Métodos especiais
    
    public Conta() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getnumConta() {
        return this.numConta;
    }

    public void setnumConta(int n) {
        this.numConta = n;

    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float m) {
        this.saldo = m;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

}
