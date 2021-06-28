import java.util.Scanner;

public class AppVeiculo {
    public static void main(String[] args) {

        GerenciarVeiculos gv = new GerenciarVeiculos();

        Scanner teclado = new Scanner(System.in);

        // interação com o usuário

        int menu;
        String modelo, tipoCombust, marca, placa;
        int anoFabricacao;
        double valorMercado;
        char resposta;

        do {
            System.out.println("\n1- Adiciona veiculo");
            System.out.println("2- Remover automotor");
            System.out.println("3- Busca automotor");
            System.out.println("4- Listar veiculos");
            System.out.println("5- Imposto do veiculo");
            System.out.println("6- Carros movidos a combustivel");

            
            menu = teclado.nextInt();


            switch (menu) {
                case 1:
                    System.out.println("Informe o modelo:");
                    modelo = teclado.next();
                    System.out.println("Tipo de combustivel?");
                    tipoCombust = teclado.next();
                    System.out.println("Digite a marca do automovel");
                    marca = teclado.next();
                    System.out.println("Ano do fabricação do automovel");
                    anoFabricacao = teclado.nextInt();
                    System.out.println("Digite o valor no mercado:");
                    valorMercado = teclado.nextDouble();
                    System.out.println("Placa do automovel:");
                    placa = teclado.next();
                    gv.adicionar(modelo, tipoCombust, marca, anoFabricacao, valorMercado, placa);

                    System.out.println("Veículo cadastrado com sucesso!");

                    break;

                case 2:
                    System.out.println(gv.listarVeiculos());
                    System.out.println("se você quer apagar um automotor, digite a placa:");
                    placa = teclado.next();
                    gv.remover(placa);

                    System.out.println("Veículo removido com sucesso!");

                    break;

                case 3:
                    System.out.println(gv.listarVeiculos());
                    System.out.println("Qual automotor você quer encontrar? digite a placa: ");
                    placa = teclado.next();
                    gv.buscarPorPlaca(placa);

                    break;

                case 4:
                    System.out.println(gv.listarVeiculos());

                    break;

                case 5:
                    System.out.println(gv.listarVeiculos());
                    System.out.println("Para saber o valor do imposto, digite a placa do veículo desejado:");
                    placa = teclado.next();
                    gv.obterValorImposto(placa);

                    break;

                case 6:
                    System.out.println(gv.listarVeiculos());
                    System.out.println("lista carros que sejam movidos por combustível");
                    tipoCombust = teclado.next();
                    gv.listarVeiculoPorCombustivel(tipoCombust);

                    break;

                default:
                    System.out.println("Opção inválida.\n");
                    break;
            }

            System.out.println("Deseja continuar no programa?s/n");
            resposta = teclado.next().charAt(0);

        } while (resposta == 's');

        teclado.close();
    }

}
