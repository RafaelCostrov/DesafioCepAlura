package Classes;

public class InformacoesEndereco {

    private String numeroCep;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;


    public InformacoesEndereco(InformacoesViaCep informacoesViaCep) {
        this.numeroCep = informacoesViaCep.cep();
        this.endereco = informacoesViaCep.logradouro();
        this.bairro = informacoesViaCep.bairro();
        this.cidade = informacoesViaCep.localidade();
        this.estado = informacoesViaCep.uf();
    }

    @Override
    public String toString() {
        return String.format("""
                Endereço completo:
                Endereço: %s;
                Bairro: %s;
                Cidade: %s;
                Estado: %s;
                Número do CEP: %s;
                """, endereco, bairro, cidade,estado, numeroCep);
    }
}
