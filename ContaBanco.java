import java.io.ObjectInputFilter.Status;

public class ContaBanco{
    public  int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    /**
     * 
     */
    public void estadoAtual(){
        System.out.println("Dono: "+this.getDono());
        System.out.println("Número da conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }
    
    public void abrirConta(String tp){
        this.setTipo(tp);
        this.setStatus(true);
        if("CC".equals(tp)){
            this.setSaldo(50);

        }else if("CP".equals(tp)){
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if (this.getSaldo()>0) {
            System.out.println("Conta não pode ser fechada");
        }else if (this.getSaldo()<0) {
            System.out.println("Você está em débito");
        }else{
            System.out.println("Conta fechada");
            this.setStatus(false);
        }
    }
    public void depositar(float v){
       if (this.getStatus()) {
        this.setSaldo(this.getSaldo()+ v);
        System.out.println("Depósito realizao com sucesso");
    }else{
        System.out.println("Impossível sacar");
    }
}
    public void sacar(float v){
        if (getStatus()) {
            if (this.getSaldo()>= v){
                this.setSaldo(this.getSaldo()- v);
                System.out.println("Saque realizao com sucesso");
            }else{
                System.out.println("Você não tem saldo o suficiente");
            }
            
        }else{
            System.out.println("Conta fechada");
        }
    }public void pagarMensal(){
        int v=0;
        if (this.getTipo().equals("CC")) {
            v=12;
            
        } else if (this.getTipo().equals("CP")) {
            v=20;
            
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()- v);
            System.out.println("Mensalidade paga por "+ this.getDono());
        }else{
            System.out.println("Impossivel aprovar esse pagamento com uma conta fechada");
        }
    }


public ContaBanco(float saldo, boolean status) {
    this.setSaldo(0);
    this.setStatus(false);
}
public int getNumConta() {
    return numConta;
}
public void setNumConta(int n) {
    this.numConta = n;
}
public String getTipo() {
    return tipo;
}
public void setTipo(String tp) {
    this.tipo=tp;
}
public String getDono() {
    return dono;
}
public void setDono(String d) {
    this.dono = d;
}
public float getSaldo() {
    return saldo;
}
public void setSaldo(float s) {
    this.saldo = s;
}
public boolean getStatus() {
    return status;
}
public void setStatus(boolean st) {
    this.status = st;
}

}