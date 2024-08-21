import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis para armazenar os dados
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        try {
            // Solicitando e lendo os dados do usuário
            System.out.print("Por favor, digite o número da Conta: ");
            numero = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha pendente

            System.out.print("Por favor, digite o número da Agência: ");
            agencia = scanner.nextLine();

            System.out.print("Por favor, digite o nome do Cliente: ");
            nomeCliente = scanner.nextLine();

            System.out.print("Por favor, digite o saldo da Conta: ");
            // Lê a entrada como uma linha e depois converte para double
            String saldoInput = scanner.nextLine();
            saldo = Double.parseDouble(saldoInput);

            // Fechando o scanner
            scanner.close();

            // Formatando a mensagem
            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                    + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

            // Exibindo a mensagem
            System.out.println(mensagem);

        } catch (NumberFormatException e) {
            System.out.println("Erro: O saldo deve ser um número decimal válido.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
