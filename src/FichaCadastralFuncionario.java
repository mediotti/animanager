//Nome: Gabriel Mediotti Marques
//RA: 2266377
public class FichaCadastralFuncionario extends FichaCadastral {
    public String setorFuncionario;
    public String cargoFuncionario;
    private FichaCadastralEndereco enderecoFuncionario;

    Leitura leitor = new Leitura();

    public FichaCadastralFuncionario(){
        enderecoFuncionario = new FichaCadastralEndereco();
        try {
            setCPFFicha();
        }catch (CpfDiferente11AlgarismosException cpfdiffexc){
            cpfdiffexc.impCpfDiferente();
        }
        setNomeFicha();
        setCargoFuncionario(leitor.input("Insira o cargo do funcionário: "));
        setSetorFuncionario(leitor.input("Insira o setor de operação do funcionário: "));
        setEnderecoFuncionario();
        System.out.println(getEnderecoFuncionario().toString());
    }


    public String getSetorFuncionario() {
        return setorFuncionario;
    }

    public void setSetorFuncionario(String setorFuncionario) {
        this.setorFuncionario = setorFuncionario;
    }

    public String getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(String cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }

    private FichaCadastralEndereco getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario() {
        System.out.println("\nInsira o endereço do funcionário cadastrado\n");
        getEnderecoFuncionario().setEnderecoRua(leitor.input("Insira a rua: "));
        getEnderecoFuncionario().setEnderecoNum(leitor.input("Insira o numero: "));
        getEnderecoFuncionario().setEnderecoComplemento(leitor.input("Insira o complemento: "));
        try {
            getEnderecoFuncionario().setEnderecoCEP(leitor.input("Insira o CEP: "));
        } catch (CepDiferente8AlgarismosException cepdiffexc){
            cepdiffexc.impCepDiferente();
        }
    }

    public String getNomeFicha() {
        return fichaNome;
    }

    public String getCPFFicha() {
        return fichaCPF;
    }

    public void setNomeFicha() {
        fichaNome = leitor.input("Insira o nome do Funcionario: ");
        System.out.println("Nome inserido: " + getNomeFicha());
    }

    public void setCPFFicha() throws CpfDiferente11AlgarismosException {
        fichaCPF = leitor.input("Insira o CPF da ficha do Funcionario: ");
        if (fichaCPF.length() != 11){
            throw new CpfDiferente11AlgarismosException();
        }
        System.out.println("CPF inserido: " + getCPFFicha());
    }
}
