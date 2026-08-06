import java.util.Scanner;

public class pedidos{
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem vindo a Pastelandia Meta");
        Scanner teclado = new Scanner(System.in);
        int opcao=1;
       
       while (opcao==1) {
        System.out.println("Selecione a opção desejada");
        System.out.println("1 - Comprar um pastel");
        System.out.println("2 - Sair");
        System.out.print("Digite o codigo o codigo: ");
        opcao = teclado.nextInt();
       
        System.out.println("Selecione a opção desejada");
        System.out.println("1 - Comprar um pastel");
        System.out.println("2 - Sair");

        
        
        if (opcao == 1){
        System.out.println("Selecione um tipo de pastel: ");
        System.out.println("1 - Pastel de carne - R$ 1,50 ");
        System.out.println("2 - Pastel de queijo - R$ 1,30 ");
        int numero = teclado.nextInt();
        if (numero == 1) {


          System.out.print("Pastel de carne foi adicionado ao pedido");}
        else if (numero == 2){System.out.print("Pastel de queijo foi adicionado ao pedido");}
         
        }
        else{System.out.println("Sistema fechado, Volte sempre");
        teclado.close();
        }
      }
      System.out.println("Parabens seu codigo deu certo!!!!");
       
    }
}
