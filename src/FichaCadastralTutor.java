public class FichaCadastralTutor extends FichaCadastral{
    private String telefoneTutor;
    private FichaCadastralEndereco enderecoTutor;
    Leitura leitor = new Leitura();

public FichaCadastralTutor(){
    enderecoTutor = new FichaCadastralEndereco();
    setIdFicha();
    setNomeFicha();
    setTutorTelefone();
    setEnderecoTutor();
    System.out.println(getEnderecoTutor().toString());
}

    public String getNomeFicha() {
        return fichaNome;
    }
    public String getIdFicha() {
        return fichaID;
    }
    public String getTelefoneTutor() {
        return telefoneTutor;
    }
    public FichaCadastralEndereco getEnderecoTutor() {
        return enderecoTutor;
    }

    public void setNomeFicha() {
        fichaNome = leitor.input("Insira o nome do Tutor: ");
        System.out.println("Nome inserido: " + getNomeFicha());
        }
    public void setIdFicha() {
        fichaID = leitor.input("Insira o ID da ficha do Tutor: ");
        System.out.println("ID inserido: " + getIdFicha());
    }
    public void setTutorTelefone() {
        telefoneTutor = leitor.input("Insira o telefone do tutor: ");
        System.out.println("Telefone inserido: " + getTelefoneTutor());
    }
    public void setEnderecoTutor() {
        getEnderecoTutor().setEnderecoRua(leitor.input("Insira a rua: "));
        getEnderecoTutor().setEnderecoNum(leitor.input("Insira o numero: "));
        getEnderecoTutor().setEnderecoComplemento(leitor.input("Insira o complemento: "));
        getEnderecoTutor().setEnderecoCEP(leitor.input("Insira o CEP: "));

    }
}
