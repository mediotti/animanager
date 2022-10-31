public class FichaCadastralAnimal extends FichaCadastral{

    private FichaCadastralAnimalDescricao fichaCadastralAnimalDescricao;
    private String fichaCadastralAnimalTutorResponsavel;
    Leitura leitor = new Leitura();

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
        getDescricaoAnimal().setAnimalCadastroIdade(Integer.parseInt(leitor.input("Insira a idade do animal: ")));
        getDescricaoAnimal().setAnimalCadastroPeso(Double.parseDouble(leitor.input("Insira o peso do animal: ")));
        getDescricaoAnimal().setAnimalCadastroSexo(leitor.input("Insira o sexo do animal M/F/A/O: ").charAt(0));
        getDescricaoAnimal().setAnimalCadastroCastrado(leitor.input("O animal é castrado? S/N: ").charAt(0));
    }

    public String getNomeFicha() {
        return fichaNome;
    }
    public void setNomeFicha() {
        fichaNome = leitor.input("Insira o nome do Animal: ");
        System.out.println("Nome inserido: " + getNomeFicha());
    }

    public String getIdFicha() {
        return fichaID;
    }
    public void setIdFicha() {
        fichaID = leitor.input("Insira o ID da ficha do Animal: ");
        System.out.println("ID inserido: " + getIdFicha());
    }
}
