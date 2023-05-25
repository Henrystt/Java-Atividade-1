public abstract class Imovel {
    private Double preco;
    private String endereco;
    

    //construtores
    public Imovel(){
      preco = 0.0;
      endereco = null;  
    }
    public Imovel(String endereco, Double preco){
        this.endereco = endereco;
        this.preco = preco;
    }
    public Imovel(Imovel c){
        endereco = c.endereco;
        preco = c.preco;
    }

    //getters e setters
    public String getEndereco(){
        return endereco;
    }
    public Double getPreco(){
        return preco;
    } 
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }

}
