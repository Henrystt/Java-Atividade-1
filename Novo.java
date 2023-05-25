import java.time.LocalDate;


public class Novo extends Imovel {
    private double adicional;
    private LocalDate dataConstrucao;

    //construtores
    public Novo() {
        super("", 0.0);
        this.adicional = 0.0;
        this.dataConstrucao = null;
    }
    public Novo(double adicional, LocalDate dataConstrucao) {
        this.adicional = adicional;
        this.dataConstrucao = dataConstrucao;
    }
    public Novo(Novo N) {
        this.adicional = N.getAdicional();
        this.dataConstrucao = N.getDataConstrucao();
    }

    //getter e setter
    public double getAdicional() {
        return adicional;
    }
    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    public LocalDate getDataConstrucao() {
        return dataConstrucao;
    }
    public void setDataConstrucao(LocalDate dataConstrucao) {
        this.dataConstrucao = dataConstrucao;
    }
    
    //metodo
    public void setDataConstrucao(int ano, int mes, int dia) {
        this.dataConstrucao = LocalDate.of(dia, mes, ano);
    }
    public void imprimeInformacoesN() {
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Adicional de Imovel novo: R$" + adicional);
        System.out.println("Data de Construção: " + dataConstrucao);
        System.out.println("Valor Total do Imovel com o Adicional:" +(adicional + getPreco()));
    }
}