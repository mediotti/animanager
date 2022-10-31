public class FichaCadastralEndereco {
    String enderecoRua = "";
    String enderecoNum = "";
    String enderecoComplemento = "";
    String enderecoCEP = "";

    public String getEnderecoRua(){
        return enderecoRua;
    }

    public String getEnderecoNum(){
        return enderecoNum;
    }

    public String getEnderecoComplemento(){
        return enderecoComplemento;
    }

    public String getEnderecoCEP(){
        return enderecoCEP;
    }

    public void setEnderecoRua(String enderecoRua){
        this.enderecoRua = enderecoRua;
    }

    public void setEnderecoNum(String enderecoNum){
        this.enderecoNum = enderecoNum;
    }

    public void setEnderecoComplemento(String enderecoComplemento){
        this.enderecoComplemento = enderecoComplemento;
    }

    public void setEnderecoCEP(String enderecoCEP){
        this.enderecoCEP = enderecoCEP;
    }

    public String toString() {
        return "FichaCadastralEndereco{" +
                "enderecoRua='" + enderecoRua + '\'' +
                ", enderecoNum='" + enderecoNum + '\'' +
                ", enderecoComplemento='" + enderecoComplemento + '\'' +
                ", enderecoCEP='" + enderecoCEP + '\'' +
                '}';
    }
}
