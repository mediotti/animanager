public class FichaCadastralFuncionario extends FichaCadastral {
    public String setorFuncionario;
    public String cargoFuncionario;
    private FichaCadastralEndereco enderecoFuncionario;

    Leitura leitor = new Leitura();

    public FichaCadastralFuncionario(){
        enderecoFuncionario = new FichaCadastralEndereco();
        setIdFicha();
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
        getEnderecoFuncionario().setEnderecoCEP(leitor.input("Insira o CEP: "));
    }

    public String getNomeFicha() {
        return fichaNome;
    }

    public String getIdFicha() {
        return fichaID;
    }

    public void setNomeFicha() {
        fichaNome = leitor.input("Insira o nome do Funcionario: ");
        System.out.println("Nome inserido: " + getNomeFicha());
    }

    public void setIdFicha() {
        fichaID = leitor.input("Insira o ID da ficha do Funcionario: ");
        System.out.println("ID inserido: " + getIdFicha());
    }
}
