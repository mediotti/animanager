//Nome: Gabriel Mediotti Marques
//RA: 2266377
public class FichaCadastralAnimal extends FichaCadastral{

    private FichaCadastralAnimalDescricao fichaCadastralAnimalDescricao;
    private String fichaCadastralAnimalTutorResponsavel;
    Leitura leitor = new Leitura();
    private String fichaID;

    public FichaCadastralAnimal(){
        fichaCadastralAnimalDescricao = new FichaCadastralAnimalDescricao();
        setIdFicha();
        setNomeFicha();
        setDescricaoAnimal();
        setFichaCadastralAnimalTutorResponsavel();
    }

    private void setFichaCadastralAnimalTutorResponsavel() {
        System.out.println("\nInsira as informações do tutor responsável pelo animal");
        fichaCadastralAnimalTutorResponsavel = leitor.input("Insira o Id da ficha cadastral do tutor responsável: ");
    }

    public String getFichaCadastralAnimalTutorResponsavel(){
        return fichaCadastralAnimalTutorResponsavel;
    }

    private FichaCadastralAnimalDescricao getDescricaoAnimal() {
        return fichaCadastralAnimalDescricao;
    }
    private void setDescricaoAnimal() {
        System.out.println("\nInsira as descrições do animal");
        getDescricaoAnimal().setAnimalCadastroEspecie(leitor.input("Insira a espécie do animal: "));
        getDescricaoAnimal().setAnimalCadastroRaca(leitor.input("Insira a raça do animal: "));
        try{
            getDescricaoAnimal().setAnimalCadastroIdade(Integer.parseInt(leitor.input("Insira a idade do animal: ")));
        }catch (IdadeAnimalNegativaException idadeexc){
            idadeexc.impIdadeAnimalNegativa();
        }
        try{
            getDescricaoAnimal().setAnimalCadastroPeso(Double.parseDouble(leitor.input("Insira o peso do animal: ")));
        }catch (PesoAnimalNegativoException pesoexc){
            pesoexc.impPesoAnimalNegativo();
        }
        try {
            getDescricaoAnimal().setAnimalCadastroSexo(leitor.input("Insira o sexo do animal M/F/A/O: ").toLowerCase().charAt(0));
        }catch (SexoAnimalIndefinidoException sexoexc){
            sexoexc.impSexoAnimalIndefinido();
        }
        try {
            getDescricaoAnimal().setAnimalCadastroCastrado(leitor.input("O animal é castrado? S/N: ").charAt(0));
        } catch (AnimalCastradoIndefinidoException castradoexc){
            castradoexc.impAnimalCastradoIndefinido();
        }
    }

    public String getNomeFicha() {
        return fichaNome;
    }

    public String getCPFFicha() {
        return null;
    }

    public void setNomeFicha() {
        fichaNome = leitor.input("Insira o nome do Animal: ");
        System.out.println("Nome inserido: " + getNomeFicha());
    }

    public void setCPFFicha() throws CpfDiferente11AlgarismosException {

    }

    public String getIdFicha() {
        return fichaID;
    }
    public void setIdFicha() {
        fichaID = leitor.input("Insira o ID da ficha do Animal: ");
        System.out.println("ID inserido: " + getIdFicha());
    }


}
