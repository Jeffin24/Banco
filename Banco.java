import java.util.Scanner;
public class Banco{
    /**
     * @param args
     */
    public static void main(String[] args) {
      Scanner leia= new Scanner(System.in);
      ContaBanco p1 = new ContaBanco(0, false); 
      System.out.println("Digite o número da sua conta: "); 
      p1.setNumConta(leia.nextInt());
      System.out.println("Digite seu nome: "); 
      p1.setDono(leia.next());
      System.out.println("Digite o tipo da sua conta: "); 
      p1.abrirConta(leia.next());
      
      String r2="";
      do{
        System.out.print("Você quer depositar ou sacar? ");
      String r=leia.next();
      if (r.equals("Depositar")) {
        System.out.print("Quanto você quer depositar? ");
        p1.depositar(leia.nextFloat());
        System.out.println("Você quer fazer mais algo?");
        r2=leia.next();
      } else if (r.equals("Sacar")) {
        System.out.println("Quanto você quer sacar? ");
        p1.sacar(leia.nextFloat());
        System.out.println("Você quer fazer mais algo?");
        r2=leia.next();
      } else{
        System.out.println("Você não escolheu nenhuma das opções");
        System.out.println("Voçê respondeu que não quer alterar o saldo, digite Não após essa mensagem");
        r2=leia.next();
      }
    }while (r2.equals("Sim"));
      p1.fecharConta();
      p1.pagarMensal();

      System.out.println("----------------------------");
      p1.estadoAtual();
      
    
    
  }
}
