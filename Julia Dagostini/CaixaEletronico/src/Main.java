

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int valorNovo = 0;
    int valorSaque = 0;
    double saldo = 0.0;
    int opcao = 0;
    int senha = 0;
    int i = 0;

    for ( i = 0; i < 3; i++) {
        System.out.println("Informe a Senha (4 digitos): ");
        senha = sc.nextInt();

        if (senha == 1234) {
            while (opcao != 4 ) {
                System.out.println("Digite o número para executar uma ação:");
                System.out.println("1 - Consultar saldo");
                System.out.println("2 - Depositar dinheiro");
                System.out.println("3 - Sacar dinheiro");
                System.out.println("4 - Sair");

                opcao = sc.nextInt();
                if (opcao == 1) {
                    exibirSaldo(saldo);

                } else if (opcao == 2) {
                    System.out.println("Informe o valor do deposito: ");
                    valorNovo = sc.nextInt();
                    if (valorNovo < 0) {
                        System.out.println("Valor inválido.");
                    } else {
                        saldo = depositarDin(saldo, valorNovo);
                    }

                }  else if (opcao == 3) {
                    System.out.println("Informe o valor do saque: ");
                    valorSaque = sc.nextInt();

                    if(valorSaque > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else if(valorSaque > 500) {
                        System.out.println("O seu limite diario e de 500 reais.");
                    } else  {
                        saldo = sacarDin(saldo, valorSaque);
                    }
                } else if (opcao != 1 || opcao != 2 || opcao != 3 || opcao != 4) {
                    System.out.println("Erro! Opcao invalida.");
                }

            }
        }  else {
            System.out.println("Senha Incorreta!");
        }
    }
        System.out.println("Senha bloqueada.");
    }





    public static void exibirSaldo(double saldo) {

        System.out.println("O seu saldo é : " + saldo);
    }

    public static double depositarDin(double saldo, double valorNovo) {

        saldo = saldo + valorNovo;
        System.out.println("O novo saldo é : " + saldo);
        return saldo;
}

    public static double sacarDin(double saldo, int valorSaque) {
        saldo = saldo - valorSaque;
        System.out.println("O novo saldo é :" + saldo);
        return saldo;
    }