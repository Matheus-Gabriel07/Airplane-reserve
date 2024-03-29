package Tests;
import java.util.*;

public class hub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Variáveis */
        boolean continuar = true;
        String aeroportoName = "default";
        String vooTrack = "default";

        /* Aeroportos e voos */
        String[] aeroportosName = { "Guarulhos", "Congonhas", "Campinas", "Fotaleza" };
        ArrayList<String> airport = new ArrayList<String>(Arrays.asList(aeroportosName));

        String[] voosGru = { "GRU -> Penha/SC", "GRU -> Fortaleza", "GRU -> RJ", "GRU -> Gramado" };
        ArrayList<String> vooGru = new ArrayList<String>(Arrays.asList(voosGru));

        String[] voosCong = { "CON -> Penha/SC", "CON -> Fortaleza", "CON -> RJ", "CON -> Gramado" };
        ArrayList<String> vooCong = new ArrayList<String>(Arrays.asList(voosCong));

        String[] voosCamp = { "CAM -> Penha/SC", "CAM -> Fortaleza", "CAM -> RJ", "CAM -> Gramado" };
        ArrayList<String> vooCamp = new ArrayList<String>(Arrays.asList(voosCamp));

        String[] voosFort = { "FOR -> Penha/SC", "FOR -> Fortaleza", "FOR -> RJ", "FOR -> Gramado" };
        ArrayList<String> vooFort = new ArrayList<String>(Arrays.asList(voosFort));

        /* Main */
        do {

            System.out.println("O que deseja fazer? \n" +
                    "(1) Comprar\n" +
                    "(2) Reservar");
            int op = sc.nextInt();

            /* Compra */

            if (op == 1) {
                System.out.println("Escolha seu aeroporto");
                int n = airport.size();
                for (String str : airport) {
                    System.out.println(str);
                }
                int opc = sc.nextInt();

                switch (opc) {
                    case 1:
                        aeroportoName = "GRU";
                        System.out.println("Voos disponiveis");

                        // Geração da lista
                        n = vooGru.size();
                        for (String str : vooGru) {
                            for (int i = 1; i <= n; i++) {
                                System.out.println(i + str);
                            }
                        }

                        System.out.println("\nEscolha o voo");
                        int escVoo = sc.nextInt();

                        if (escVoo == 1) {
                            vooTrack = "GRU -> Penha/SC";
                        } else if (escVoo == 2) {
                            vooTrack = "GRU -> Fortaleza";
                        } else if (escVoo == 3) {
                            vooTrack = "GRU -> RJ";
                        } else if (escVoo == 4) {
                            vooTrack = "GRU -> Gramado";
                        }
                        break;

                    case 2:
                        aeroportoName = "Congonhas";
                        System.out.println("Voos disponiveis");

                        // Geração da lista
                        n = vooCong.size();
                        for (String str : vooCong) {
                            for (int i = 1; i <= n; i++) {
                                System.out.println(i + str);
                            }
                        }

                        System.out.println("\nEscolha o voo");
                        escVoo = sc.nextInt();

                        if (escVoo == 1) {
                            vooTrack = "CON -> Penha/SC";
                        } else if (escVoo == 2) {
                            vooTrack = "CON -> Fortaleza";
                        } else if (escVoo == 3) {
                            vooTrack = "CON -> RJ";
                        } else if (escVoo == 4) {
                            vooTrack = "CON -> Gramado";
                        }
                        break;

                    case 3:
                        aeroportoName = "Campinas";
                        System.out.println("Voos disponiveis");

                        // Geração da lista
                        n = vooCamp.size();
                        for (String str : vooCamp) {
                            for (int i = 1; i <= n; i++) {
                                System.out.println(i + str);
                            }
                        }

                        System.out.println("\nEscolha o voo");
                        escVoo = sc.nextInt();

                        if (escVoo == 1) {
                            vooTrack = "CAM -> Penha/SC";
                        } else if (escVoo == 2) {
                            vooTrack = "CAM -> Fortaleza";
                        } else if (escVoo == 3) {
                            vooTrack = "CAM -> RJ";
                        } else if (escVoo == 4) {
                            vooTrack = "CAM -> Gramado";
                        }
                        break;

                    case 4:
                        aeroportoName = "Fortaleza";
                        System.out.println("Voos disponiveis");

                        // Geração da lista
                        n = vooFort.size();
                        for (String str : vooFort) {
                            for (int i = 1; i <= n; i++) {
                                System.out.println(i + str);
                            }
                        }

                        System.out.println("\nEscolha o voo");
                        escVoo = sc.nextInt();

                        if (escVoo == 1) {
                            vooTrack = "FOR -> Penha/SC";
                        } else if (escVoo == 2) {
                            vooTrack = "FOR -> Fortaleza";
                        } else if (escVoo == 3) {
                            vooTrack = "FOR -> RJ";
                        } else if (escVoo == 4) {
                            vooTrack = "FOR -> Gramado";
                        }
                        break;

                    default:
                        System.out.println("Nenhum aeroporto escolhido");
                        break;
                }

                System.out.println("Deseja fazer a reserva? \n" +
                        "(1) Sim\n" +
                        "(2) Não");
                opc = sc.nextInt();

                if (opc == 1) {
                    System.out.println("Escolha o seu assento");
                    int opcAssento = sc.nextInt();

                    System.out.println("Informe o ID de reserva");
                    int IDreseva = sc.nextInt();
    
                    System.out.println("== ID: " + IDreseva + "== \n" +
                            "VOO: " + vooTrack + "\n" +
                            "HORÁRIO: 18:00" + "\n" +
                            "AEROPORTO: " + aeroportoName + "\n" +
                            "ASSENTO: " + opcAssento + "\n");
                } else if (opc == 2){
                    System.out.println("Informe o ID de reserva");
                    int IDreseva = sc.nextInt();
                     System.out.println("== ID: " + IDreseva + "== \n" +
                            "VOO: " + vooTrack + "\n" +
                            "HORÁRIO: 18:00" + "\n" +
                            "AEROPORTO: " + aeroportoName + "\n");
                }
            }

            /* Reserva */

            if (op == 2) {
                System.out.println("Já fex a reserva? \n" +
                        "(1) Sim\n" +
                        "(2) Não");
                int opc = sc.nextInt();

                /* Já fez a reserva */
                if (opc == 1) {
                    System.out.println("Informe o ID de reserva");
                    int IDreseva = sc.nextInt();
                    int sizeId = IDreseva.charAt();

                    if (sizeId >= 9) {
                        System.out.println("== ID: " + IDreseva + "== \n" +
                                "VOO: " + vooTrack + "\n" +
                                "HORÁRIO: " + "\n" +
                                "AEROPORTO: " + aeroportoName + "\n");
                    } else if (sizeId < 9) {
                        System.out.println("ID invalido, tente novamente");
                    }
                }

                /* Não fez a reserva */

                if (opc == 2) {
                    System.out.println("Informe o ID de reserva");
                    int IDreseva = sc.nextInt();

                    System.out.println("Escolha seu aeroporto");
                    int n = airport.size();
                    for (String str : airport) {
                        System.out.println(str);
                    }
                    opc = sc.nextInt();

                    switch (opc) {
                        case 1:
                            aeroportoName = "GRU";
                            System.out.println("Voos disponiveis");

                            // Geração da lista
                            n = vooGru.size();
                            for (String str : vooGru) {
                                for (int i = 1; i <= n; i++) {
                                    System.out.println(i + str);
                                }
                            }

                            System.out.println("\nEscolha o voo");
                            int escVoo = sc.nextInt();

                            if (escVoo == 1) {
                                vooTrack = "GRU -> Penha/SC";
                            } else if (escVoo == 2) {
                                vooTrack = "GRU -> Fortaleza";
                            } else if (escVoo == 3) {
                                vooTrack = "GRU -> RJ";
                            } else if (escVoo == 4) {
                                vooTrack = "GRU -> Gramado";
                            }
                            break;

                        case 2:
                            aeroportoName = "Congonhas";
                            System.out.println("Voos disponiveis");

                            // Geração da lista
                            n = vooCong.size();
                            for (String str : vooCong) {
                                for (int i = 1; i <= n; i++) {
                                    System.out.println(i + str);
                                }
                            }

                            System.out.println("\nEscolha o voo");
                            escVoo = sc.nextInt();

                            if (escVoo == 1) {
                                vooTrack = "CON -> Penha/SC";
                            } else if (escVoo == 2) {
                                vooTrack = "CON -> Fortaleza";
                            } else if (escVoo == 3) {
                                vooTrack = "CON -> RJ";
                            } else if (escVoo == 4) {
                                vooTrack = "CON -> Gramado";
                            }
                            break;

                        case 3:
                            aeroportoName = "Campinas";
                            System.out.println("Voos disponiveis");

                            // Geração da lista
                            n = vooCamp.size();
                            for (String str : vooCamp) {
                                for (int i = 1; i <= n; i++) {
                                    System.out.println(i + str);
                                }
                            }

                            System.out.println("\nEscolha o voo");
                            escVoo = sc.nextInt();

                            if (escVoo == 1) {
                                vooTrack = "CAM -> Penha/SC";
                            } else if (escVoo == 2) {
                                vooTrack = "CAM -> Fortaleza";
                            } else if (escVoo == 3) {
                                vooTrack = "CAM -> RJ";
                            } else if (escVoo == 4) {
                                vooTrack = "CAM -> Gramado";
                            }
                            break;

                        case 4:
                            aeroportoName = "Fortaleza";
                            System.out.println("Voos disponiveis");

                            // Geração da lista
                            n = vooFort.size();
                            for (String str : vooFort) {
                                for (int i = 1; i <= n; i++) {
                                    System.out.println(i + str);
                                }
                            }

                            System.out.println("\nEscolha o voo");
                            escVoo = sc.nextInt();

                            if (escVoo == 1) {
                                vooTrack = "FOR -> Penha/SC";
                            } else if (escVoo == 2) {
                                vooTrack = "FOR -> Fortaleza";
                            } else if (escVoo == 3) {
                                vooTrack = "FOR -> RJ";
                            } else if (escVoo == 4) {
                                vooTrack = "FOR -> Gramado";
                            }
                            break;

                        default:
                            System.out.println("Nenhum aeroporto escolhido");
                            break;
                    }

                    System.out.println("Escolha o seu assento");
                    System.out.println();
                    int opcAssento = sc.nextInt();

                    System.out.println("== ID: " + IDreseva + "== \n" +
                            "VOO: " + vooTrack + "\n" +
                            "HORÁRIO: " + "\n" +
                            "AEROPORTO: " + aeroportoName + "\n" +
                            "ASSENTO: " + opcAssento + "\n");

                    System.out.println("Deseja comprar mais alguma reserva? \n" +
                            "(1) Sim\n" +
                            "(2) Não");
                    opc = sc.nextInt();

                    if (opc == 2) {
                        continuar = false;
                    } else {
                        continuar = true;
                    }
                }
            }
        } while (continuar = false);
    }
}
