import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome");
        nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o número da agência!");
        agencia = entrada.nextLine();

        System.out.println("Por favor, digite o número da conta!");
        numero = entrada.nextInt();

        System.out.println("Por favor, digite seu saldo!");
        saldo = entrada.nextDouble();

        entrada.close();

        String mensagem = "Olá ".concat(nomeCliente)
        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(agencia)
        .concat(", conta ")
        .concat( String.valueOf(numero))
        .concat(" e seu saldo ")
        .concat( String.valueOf(saldo))
        .concat(" já está disponível para saque");

        System.out.println("\n");
        System.out.println(mensagem);
        System.out.println("\n");

    }
}
