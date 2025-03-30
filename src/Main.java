import dispositivo.Iphone;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Fazer Chamada");
            System.out.println("2. Receber Chamada");
            System.out.println("3. Enviar Mensagem");
            System.out.println("4. Receber Mensagem");
            System.out.println("5. Tocar Música");
            System.out.println("6. Pausar Música");
            System.out.println("7. Acessar Página");
            System.out.println("8. Buscar na Internet");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Digite o número para chamada: ");
                    String numeroChamada = scanner.nextLine();
                    iphone.fazerChamada(numeroChamada);
                    break;
                case 2:
                    System.out.print("Digite o número que está ligando: ");
                    String numeroRecebido = scanner.nextLine();
                    iphone.receberChamada(numeroRecebido);
                    break;
                case 3:
                    System.out.print("Digite o número para enviar mensagem: ");
                    String numeroMensagem = scanner.nextLine();
                    System.out.print("Digite a mensagem: ");
                    String mensagem = scanner.nextLine();
                    iphone.enviarMensagem(numeroMensagem, mensagem);
                    break;
                case 4:
                    System.out.print("Digite o número que enviou a mensagem: ");
                    String numeroRecebendoMensagem = scanner.nextLine();
                    System.out.print("Digite a mensagem recebida: ");
                    String mensagemRecebida = scanner.nextLine();
                    iphone.receberMensagem(numeroRecebendoMensagem, mensagemRecebida);
                    break;
                case 5:
                    System.out.print("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    iphone.tocarMusica(musica);
                    break;
                case 6:
                    iphone.pausarMusica();
                    break;
                case 7:
                    System.out.print("Digite a URL da página: ");
                    String url = scanner.nextLine();
                    iphone.acessarPagina(url);
                    break;
                case 8:
                    System.out.print("Digite o termo de busca: ");
                    String termo = scanner.nextLine();
                    iphone.buscar(termo);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 0);

        scanner.close();
    }
}