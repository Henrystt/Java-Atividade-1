import java.util.Scanner;


public class Teste{
    public static void main(String[] args) {
        
        int opcao;
        Novo nv = new Novo();
        Usado us = new Usado();
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("--------------------------------");
            System.out.println("Seleciona uma opção");
            System.out.println("1. Exibir Imoveis novos");
            System.out.println("2. Exibir Imoveis usados");
            System.out.println("3. Registrar Imovel");
            System.out.println("4. Finalizar sistema");
            System.out.println("--------------------------------");

            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    // instanciar Novo
                    System.out.println("");

                    System.out.println("Dados do Imovel:");
                    nv.setEndereco("Jardim das flores, Osasco");
                    nv.setPreco(50000.0);
                    nv.setAdicional(250.0);
                    nv.setDataConstrucao(20, 4, 2000);

                    nv.imprimeInformacoesN();
                    break;

                case 2:
                    //instancia Usado
                    System.out.println("");

                    System.out.println("Dados do Imovel:");
                    us.setEndereco("Bela Vista, São Paulo");
                    us.setPreco(150500.0);
                    us.setDesconto(790);
                    us.setNumeroDonos(3);
                    us.setTempoUso(5);
                    us.setDataConstrucao(2006);

                    us.imprimeInformacoesU();
                    break;

                case 3:
                    //Metodo para inserir as informações
                    int escolha;
                    System.out.println("--------------------------------------------------");
                    System.out.println("Selecione uma das opções para o tipo de Imovel");
                    System.out.println("1. Registrar Imovel novo");
                    System.out.println("2. Registrar Imovel usado");
                    System.out.println("--------------------------------------------------");

                    escolha = scanner.nextInt();

                    switch(escolha){
                        case 1:
                        
                        scanner.nextLine();

                            System.out.println("Insira o bairo e municipio do Imovel");
                            nv.setEndereco(scanner.nextLine());
                            System.out.println("Insira o preço do Imovel");
                            nv.setPreco(scanner.nextDouble());
                            System.out.println("Insira o o valor adiconal pelo imovel ser novo");
                            nv.setAdicional(scanner.nextDouble());
                            System.out.println("Insira a data de construção do imovel no formato Ano, Mês e Dia");
                            
                            int ano = scanner.nextInt();
                            int mes = scanner.nextInt();
                            int dia = scanner.nextInt();
                            nv.setDataConstrucao(dia, mes, ano);

                            nv.imprimeInformacoesN();
                            break;

                        case 2:
                        scanner.nextLine();
                            System.out.println("Insira o bairo e municipio do Imovel");
                            us.setEndereco(scanner.nextLine());
                            System.out.println("Insira o preço do Imovel");
                            us.setPreco(scanner.nextDouble());
                            System.out.println("Insira o o valor adiconal pelo imovel ser novo");
                            us.setDesconto(scanner.nextDouble());
                            System.out.println("Insira o Numero de donos anteriores");
                            us.setNumeroDonos(scanner.nextInt());
                            System.out.println("Insira a quantos anos este imovel está em uso");
                            us.setTempoUso(scanner.nextInt());
                            System.out.println("Insira o ano de construção do imovel");
                            us.setDataConstrucao(scanner.nextInt());

                            us.imprimeInformacoesU();
                            break;

                         
                    }
                    break;
                    
                case 4:
                System.out.println("Sistema encerrado");
                break;

                default:
                System.out.println("Opção Invalida");
                break;

            }

        } while (opcao != 4);


      scanner.close(); 
    }
}