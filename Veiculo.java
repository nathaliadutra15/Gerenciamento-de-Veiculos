public class Veiculo {
    // Atributos

    String modelo;
    String marca;
    int anoFabricacao;
    double valorMercado;
    String placa;
    String tipoCombust;
    String auxCombust; // Uma variavel para auxiliar o recebimento do dado para transformar em caixa alta

    // métodos
    public Veiculo(String modelo, String tipoCombust, String marca, int anoFabricacao, double valorMercado,
            String placa) {
        this.modelo = modelo;
        this.tipoCombust = tipoCombust;
        this.auxCombust = tipoCombust.toUpperCase();
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.valorMercado = valorMercado;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getanoFabricacao() {
        return anoFabricacao;
    }

    public double getvalorMercado() {
        return valorMercado;
    }

    public void setvalorMercado(int valorMercado) {
        this.valorMercado = valorMercado;
    }

    public String getplaca() {
        return placa;
    }

    public String getcombustivel() {
        return auxCombust;
    }

    public double calcularImposto() {
        double valorImposto = 0;

        if ((2021 - this.anoFabricacao) < 20) {
            switch (this.auxCombust) {
                case "GASOLINA":
                    valorImposto = (this.valorMercado * 0.04);
                    break;

                case "DIESEL":
                    valorImposto = (this.valorMercado * 0.04);
                    break;

                case "FLEX":
                    valorImposto = (this.valorMercado * 0.04);
                    break;

                case "ALCOOL":
                    valorImposto = (this.valorMercado * 0.03);
                    break;

                case "GNV":
                    valorImposto = (this.valorMercado * 0.03);
                    break;

                default:
                    System.out.println("Combustível Inválido");
                    valorImposto = 0;
                    break;
            }

        } else {
            System.out.println("Imposto ISENTO");
            valorImposto = 0;
        }

        System.out.println("Valor do Imposto: " + valorImposto);
        return valorImposto;
    }

    public String imprimir(){
        return "Marca: "+marca+", "+"Modelo: "+modelo+", "+"Placa: "+ placa+ ", " +"Tipo de Combustível: "+ tipoCombust +", "+ "Ano: "+anoFabricacao+", "+"Valor: R$"+valorMercado;
    }

}

