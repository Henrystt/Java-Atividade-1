import java.time.LocalDate;


public class Usado extends Imovel {
    private LocalDate anoConstrucao;
    private int numeroDonos;
    private int tempoUso;
    private double desconto;

    //construtor
    public Usado(){
        super("", 0.0);
        this.anoConstrucao = null;
        this.numeroDonos = 0;
        this.tempoUso = 0;
        this.desconto = 0.0;
    }
    public Usado(LocalDate anoConstrucao, int numeroDonos, int tempoUso, double desconto) {
        this.anoConstrucao = anoConstrucao;
        this.numeroDonos = numeroDonos;
        this.tempoUso = tempoUso;
        this.desconto = desconto;
    }
    public Usado(Usado U){
        this.anoConstrucao = U.anoConstrucao;
        this.numeroDonos = U.numeroDonos;
        this.tempoUso = U.tempoUso;
        this.desconto = U.desconto;
    }

    //getter e setter
    
    public void setDataConstrucao(int ano) {
        this.anoConstrucao = LocalDate.of(ano, 1 , 1);
    }
    public int getAno(){
        return anoConstrucao.getYear();
    }
    public int getNumeroDonos() {
        return numeroDonos;
    }
    public void setNumeroDonos(int numeroDonos) {
        this.numeroDonos = numeroDonos;
    }
    public int getTempoUso() {
        return tempoUso;
    }
    public void setTempoUso(int tempoUso) {
        this.tempoUso = tempoUso;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    //metodo


    public void imprimeInformacoesU() {
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Ano de Construção: " + getAno());
        System.out.println("Número de Donos: " + numeroDonos);
        System.out.println("Tempo de Uso: " + tempoUso + " anos");
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Valor Total do Imovel com o desconto:" +(desconto + getPreco()));
    }
}
