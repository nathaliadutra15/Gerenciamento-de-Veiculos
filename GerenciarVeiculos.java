import java.util.ArrayList;

public class GerenciarVeiculos {

    private ArrayList<Veiculo> automotores;

    public GerenciarVeiculos() {
        automotores = new ArrayList<>();
    }

    public void adicionar(String modelo, String tipoCombust, String marca, int anoFabricacao, double valorMercado,
            String placa) {

        automotores.add(new Veiculo(modelo, tipoCombust, marca, anoFabricacao, valorMercado, placa));
    }

    public boolean remover(String placa) {
        for (Veiculo veiculo : automotores) {
            if (veiculo.getplaca().equalsIgnoreCase(placa)) {
                automotores.remove(veiculo);
                return true;
            }
        }

        System.out.println("Placa não encontrada!");
        return false;
    }

    public Veiculo buscarPorPlaca(String placa) {
        for (Veiculo veiculo : automotores) {
            if (veiculo.getplaca().equalsIgnoreCase(placa)) {
                System.out.println(veiculo.imprimir());
                return veiculo;
            }
        }
        return null;
    }

    public String listarVeiculos() {
        for (Veiculo V : automotores) {
            System.out.println(V.imprimir());
        }

        return null;
    }

    public double obterValorImposto(String placa) {
        for (Veiculo veiculo : automotores) {
            if (veiculo.getplaca().equalsIgnoreCase(placa)) {
                return veiculo.calcularImposto();
            }
        }
        return -1;
    }

    public void listarVeiculoPorCombustivel(String combustivel) {
        String combustivelMaiusc = combustivel.toUpperCase();

        for (Veiculo veiculo : automotores) {
            if (veiculo.getcombustivel().equals(combustivelMaiusc)) {
                System.out.println(veiculo.imprimir());
            }
        }
    }

}
