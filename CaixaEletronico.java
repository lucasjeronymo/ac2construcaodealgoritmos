//Desenvolvido por
import java.util.Scanner;
public class CaixaEletronico {
public static void main(String args[]) {
 System.out.println("Seja bem-vindo ao Profit!");
 //Declarando variáveis
 long cpfcadastro = 12345678900L;
 long cpfinformado;
 int senhacadastro = 1234;
 int senhainformada;
 int saldo = 1000;
 int num;
 int saque;
 int deposito;
 int valorfinal2;
 int valorfinal3;
 Scanner ler;
 Scanner ler1;
 ler1 = new Scanner(System.in);
 System.out.println("Digite seu cpf");
 cpfinformado = ler1.nextLong();
 ler = new Scanner(System.in);
 //Processamento
 if (cpfinformado == cpfcadastro){ 
 System.out.println("Digite sua senha");
 senhainformada = ler.nextInt();
 if (senhainformada == senhacadastro){
 System.out.println("Obrigado por fazer parte do nosso banco");
 ler = new Scanner(System.in);
 System.out.println("Escolha o que quer fazer: 1 - Exibir saldo. 2 - Fazer um depósito. 3 - Realizar um saque. 0 - Sair");
 num = ler.nextInt();
 if (num == 1){
 System.out.println("O seu saldo é de R$" + saldo);
 }
 if (num == 2){
 ler = new Scanner(System.in);
 System.out.println("Digite o valor do depósito");
 deposito = ler.nextInt();
 valorfinal2 = saldo + deposito;
 System.out.println("O seu saldo atual é de R$" + valorfinal2);
 }
 if (num == 3){
 ler = new Scanner(System.in);
 System.out.println("Digite o valor do saque (Max R$1000,00)");
 saque = ler.nextInt();
 valorfinal3 = saldo - saque;
 System.out.println("O saldo final é de R$" + valorfinal3);
 }
 if (num == 0){
 System.out.println("Obrigado por usar nosso banco!");
 }
 }else{
  System.out.println("Senha incorreta");
 }
 }else{
  System.out.println("CPF incorreto");
}
}
}
