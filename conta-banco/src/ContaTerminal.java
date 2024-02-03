import java.util.Scanner;

public class ContaTerminal {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal (int numero, String agencia, String nomeCliente, double saldo ){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;

    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("depósito de " + valor + " realizado com sucesso. Novo saldo : " + saldo);
        }else{
            System.out.println("valor de depósito inválido");
        }

    }

    public void sacar(double valor ) {
            if(valor >0 && valor <= saldo){
                saldo -= valor;
                System.out.println("Saque de "+ valor + " realizado com sucesso. Novo saldo : " + saldo);
            }else{
                System.out.println("Valor de saque inválido ou insuficiente. ");
            }
        }

            public void exibirMensagemFinal() {
                String mensagemFinal = "Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agência " + agencia + 
                ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque. ";
                System.out.println(mensagemFinal);
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Por favor, digite o número da Agência !");
                String agencia = scanner.nextLine();

                System.out.println("Por favor, digite o número da Conta !");
                int numero = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Por favor, digite o nome do Cliente !");
                String nomeCliente = scanner.nextLine();

                System.out.println("Por favor, digite o saldo da conta !");
                double saldo = scanner.nextDouble();

                ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);

                int opcao;
                do{
                    System.out.println("\nEscolha uma opção: ");
                    System.out.println("1. Depositar");
                    System.out.println("2. Sacar");
                    System.out.println("3. Sair");

                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                          System.out.println("Digite o valor para depósito:");
                         double valorDeposito = scanner.nextDouble();
                         conta.depositar(valorDeposito);
                         break;
                        case 2:
                          System.out.println("Digite o valor para sauqe :");
                          double valorSaque = scanner.nextDouble();
                          conta.sacar(valorSaque); 
                          break;
                        case 3:
                           break; 
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                    
                } while (opcao != 3);
                    
                scanner.close();

            }
    
}