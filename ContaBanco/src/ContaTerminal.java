import java.util.Scanner;

public class ContaTerminal {

    //Toda variavel que fora denominada static, foi  para poder ser acessada por todos os metodos static

    static String agencia = "067-8";
    static int numero = 1021;
    static String nomeCliente = "Mario Andrade";
    static double saldo = 237.48;
    static Scanner entrada = new Scanner(System.in);
    static int inicio = 0;
    static String cpf = "0";
    
    public static void main (String[] args) {
      
        System.out.println("Bem vindo ao seu banco, se não possui uma conta, clique em criar!");
        escolha1();    
    }
   

    
    //criei um metodo para ponto de retorno inicial caso não houvesse cadastro

     public static void escolha1(){

        System.out.println("-------------------------------\n"+
                           "   Selecione a opção desejada  \n"+
                           "-------------------------------\n"+
                           "     1 - Acessar Conta         \n"+ 
                           "     2 - Criar Nova Conta      \n"+
                           "---------------------------------");
        int inicio=entrada.nextInt();
        
            switch (inicio) {
                
                case 1:
                    if(cpf!="0"){
                        System.out.println("Por favor Digite a agência");      
                        String agenciaDigitada=entrada.next();
                            if (agenciaDigitada.equals(agencia)){
                                System.out.println("Digite sua Conta");
                                int numeroDigitado=entrada.nextInt();
                                    if(numeroDigitado==numero){
                                pressKey(); 
                                escolha2();
                                break;

                                    }else{
                                        System.out.println("Conta não encontrada");
                                        pressKey();
                                        escolha1();
                                        break;
                                        }

                            }else{
                                System.out.println("Agência não encontrada");
                                pressKey();
                                escolha1();
                                break;
                                }
                                

                    
                    
                    } else {
                        System.out.println("Você ainda não possui conta no banco");
                        pressKey();
                        escolha1();
                        break;
                         }

                         
                case 2:
                        System.out.println("Por favor insira seu cpf");
                        cpf= entrada.next();
                        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta é" +numero+ " e seu saldo é "+saldo+" já está disponível para saque.");
                        pressKey();
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
                    
                        System.out.println("Digite o valor que deseja depositar");
                        double deposito = entrada.nextDouble();
                        saldo = saldo + deposito;
                        System.out.println("Seu novo saldo é :" + saldo);
                        pressKey();
                        escolha2();              
                        break;
                       
                                   
                    case 2:
                    System.out.println("Digite o valor que deseja sacar");
                        double saque = entrada.nextDouble();

                        if (saldo>=saque){
                            saldo = saldo - saque;
                            System.out.println("Seu novo saldo é : "+saldo);
                            pressKey();
                            escolha2();
                            break;

                        }else{
                            System.out.println("Você não tem saldo o suficiente");
                            pressKey();
                            escolha2();
                            break;
                            }

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
            System.out.println("\npressione uma tecla para continuar");
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

        

      
   
