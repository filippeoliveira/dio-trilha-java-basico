import java.util.Scanner;

public class ContaTerminal {

    //Toda variavel que fora denominada static, foi  para poder ser acessada por todos os metodos static

    String agencia = "067-8";
    int numero = 1021;
    String nomeCliente = "Mario Andrade";
    static double saldo = 237.48;
    static Scanner entrada = new Scanner(System.in);
    int inicio = 0;
    String cpf = "0";
    
    public void main (String[] args) {
      
        System.out.println("Bem vindo ao seu banco, se não possui uma conta, clique em criar!");
        escolha1();
    
    }
    
    //criei um metodo para ponto de retorno inicial caso não houvesse cadastro

     public void escolha1(){

        System.out.println("-------------------------------\n"+
                           "   Selecione a opção desejada  \n"+
                           "-------------------------------\n"+
                           "     1 - Acessar Conta         \n"+ 
                           "     2 - Criar Nova Conta      \n"+
                           "---------------------------------");
        inicio=entrada.nextInt();
        
            switch (inicio) {
                
                case 1:
                    if(cpf!="0"){
                        System.out.println("Por favor Digite os dados solicitados");      
                        agencia=entrada.next();
                        System.out.println("Digite sua Conta");
                        numero=entrada.nextInt();
                            if (agencia.equals("067-8") && numero==1021){
                                 escolha2();

                            }else{
                                 System.out.println("Conta não reconhecida");           
                                 escolha1();
                                 break;
                                 }
                    
                         } else {
                        System.out.println("Você ainda não possui conta no banco");
                        escolha1();
                         }
                         
                case 2:
                        System.out.println("Por favor insira seu cpf");
                        cpf= entrada.next();
                        System.out.println("Bem vindo Mario Andrade! Anote sua AGÊNCIA :"+agencia+" e CONTA :"+numero );
                        escolha1();
                    break;

                default:
                        System.out.println("Opção incorreta!");
                    break;
                        }

          }

          public static void escolha2(){
                System.out.println("Seja Be, Vindo ao seu banco MARIO ANDRADE");
                System.out.println("-------------------------------------------\n"+
                                   "     Escolha uma das opções abaixo:        \n"+
                                   "-------------------------------------------\n"+
                                   "|             Opção 1 : Deposito          |\n"+
                                   "|             Opção 2 : Saque             |\n"+
                                   "|             Opção 3 : Saldo             |\n"+
                                   "|             Opção 4 : Sair              |\n"+
                                   "-------------------------------------------");
                
                int escolha = entrada.nextInt();                                   
                
                switch (escolha) {
                
                    case 1:
                        double deposito = entrada.nextDouble();
                        saldo = saldo + deposito;
                        System.out.println("Seu novo saldo é :" + saldo);
                        pressKey();
                        escolha2();              
                    break;
                                   
                    case 2:
                        double saque = entrada.nextDouble();
                        if (saldo>=saque){
                        saldo = saldo - saque;
                        System.out.println("Seu novo saldo é : "+saldo);
                        pressKey();
                        escolha2();

                        }else{
                        System.out.println("Você não tem saldo o suficiente");
                        }
                        pressKey();
                        escolha2();
                    break;

                    case 3:
                        System.out.println("Seu saldo é :"+saldo);
                        pressKey();
                        escolha2();
                    break;

                    case 4:
                        System.out.println("Obrigado por utilizar nosso banco!");
                        break;

                    default:
                        System.out.println("Opção invalida");
                        pressKey();
                        escolha2();
                        break;
                     }
                                
          }

          //metodo para pressionamento de tecla com captura de exceção
          private static void pressKey() {
            try { System.in.read();
                for(int clear = 0; clear < 50; clear++)
                {
                     System.out.println("\b") ;
                }
            }
            catch(Exception ex) {
                System.out.println(ex);
            } 
          }
        }

        

      
   
