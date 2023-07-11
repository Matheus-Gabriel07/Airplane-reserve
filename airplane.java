import java.util.*;

public class airplane {
    public static void main(String[] args) {
        /* Setup */
        Scanner sc = new Scanner(System.in);

        /* Main Variaveis */
        boolean continuos = true; // Loop
        int idResrve; // Quantidade de reservas
        int opcIni;
        String userName;
        int senhaUser;
        String storege = "Matheus";
        int storeSenha = 123456;

        /* Code */

        do {
            System.out.println("==================\n" +
                    "\t AIRPLANE RESERVE \n" +
                    "==================\n");
            System.out.println("Escolha uma das opções \n"+
                    "1 - Entrar \n"+
                    "2 - Cadastrar \n");
            opcIni = sc.nextInt();

            switch (opcIni) {
                case 1:
                    System.out.println("Digite seu usuário: \n");
                    userName = sc.next();
                    System.out.println("Digite sua senha: ");
                    senhaUser = sc.nextInt();

                    if (senhaUser == storeSenha){
                        System.out.println("== Seja bem-vindo == \n");
                        reservas();
                    } else if (userName != storege || senhaUser != storeSenha) {
                        System.out.println("usuário ou senha incorreto! \n");
                    }

                    break;
                
                case 2:
                    System.out.println("Digite seu usuário: \n");
                    userName = sc.next();

                    System.out.println("Digite sua senha: ");
                    senhaUser = sc.nextInt();

                    int tentativas = 0;

                    if (userName == storege){
                        for(tentativas = 0; tentativas < 5;){
                            System.out.println("nome de usuário já esta sendo usado, tente outro. \n");
                            tentativas++;
                            return;
                        }
                    } else if (userName == storege && senhaUser == storeSenha) {
                        System.out.println("== Seja bem-vindo == \n");
                        storeSenha++;
                        reservas();
                    }
                    break;

                default :
                    break;
            }

        } while (continuos != false);
        sc.close();

    }
    
    public static void reservas() {
        System.out.println("Olá");
    }
    
}