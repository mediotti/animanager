public interface FichaCadastralEndereco {
    String enderecoRua;
    String enderecoNum;
    String enderecoComplemento;
    String enderecoCEP;

    public String getEnderecoRua() {

    }

    public void setEnderecoRua(String enderecoRua) {
    }

    public String getEnderecoNum() {
    }

    public void setEnderecoNum(String enderecoNum) {
        this.enderecoNum = enderecoNum;
    }

    public String getEnderecoComplemento() {
        return enderecoComplemento;
    }

    public void setEnderecoComplemento(String enderecoComplemento) {
        this.enderecoComplemento = enderecoComplemento;
    }

    public String getEnderecoCEP() {
        return enderecoCEP;
    }

    public void setEnderecoCEP(String enderecoCEP) {
        this.enderecoCEP = enderecoCEP;
    }
}
