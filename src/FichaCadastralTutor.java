//Nome: Gabriel Mediotti Marques
//RA: 2266377
public class FichaCadastralTutor extends FichaCadastral{
    private String telefoneTutor;
    private FichaCadastralEndereco enderecoTutor;
    Leitura leitor = new Leitura();

public FichaCadastralTutor(){
    enderecoTutor = new FichaCadastralEndereco();
    try {
        setCPFFicha();
    } catch (CpfDiferente11AlgarismosException cpfdiffexc){
        cpfdiffexc.impCpfDiferente();
    }
    setNomeFicha();
    try{
        setTutorTelefone();
    }catch(CelularDiferente11AlgarismosException celulardiffexc){
        celulardiffexc.impCelularDiferente();
    }
    setEnderecoTutor();
    System.out.println(getEnderecoTutor().toString());
}

    public String getNomeFicha() {
        return fichaNome;
    }
    public String getCPFFicha() {
        return fichaCPF;
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
    public void setCPFFicha() throws CpfDiferente11AlgarismosException {
        fichaCPF = leitor.input("Insira o CPF da ficha do Funcionario: ");
        if (fichaCPF.length() != 11){
            throw new CpfDiferente11AlgarismosException();
        }
        System.out.println("CPF inserido: " + getCPFFicha());
    }
    public void setTutorTelefone() throws CelularDiferente11AlgarismosException {
        telefoneTutor = leitor.input("Insira o telefone do tutor: ");
        System.out.println("Telefone inserido: " + getTelefoneTutor());
        if (telefoneTutor.length() != 11){
            throw new CelularDiferente11AlgarismosException();
        }
    }
    public void setEnderecoTutor() {
        getEnderecoTutor().setEnderecoRua(leitor.input("Insira a rua: "));
        getEnderecoTutor().setEnderecoNum(leitor.input("Insira o numero: "));
        getEnderecoTutor().setEnderecoComplemento(leitor.input("Insira o complemento: "));
        try {
            getEnderecoTutor().setEnderecoCEP(leitor.input("Insira o CEP: "));
        } catch (CepDiferente8AlgarismosException cepdiffexc){
            cepdiffexc.impCepDiferente();
        }
    }
}
