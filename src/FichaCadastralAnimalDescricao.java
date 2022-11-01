//Nome: Gabriel Mediotti Marques
//RA: 2266377
public class FichaCadastralAnimalDescricao {
    String animalCadastroEspecie;
    String animalCadastroRaca;
    Integer animalCadastroIdade;
    Double animalCadastroPeso;
    Character animalCadastroSexo;
    Character animalCadastroCastrado;

    public String getAnimalCadastroEspecie() {
        return animalCadastroEspecie;
    }

    public void setAnimalCadastroEspecie(String animalCadastroEspecie) {
        this.animalCadastroEspecie = animalCadastroEspecie;
    }

    public String getAnimalCadastroRaca() {
        return animalCadastroRaca;
    }

    public void setAnimalCadastroRaca(String animalCadastroRaca) {
        this.animalCadastroRaca = animalCadastroRaca;
    }

    public Integer getAnimalCadastroIdade() {
        return animalCadastroIdade;
    }

    public void setAnimalCadastroIdade(Integer animalCadastroIdade) throws IdadeAnimalNegativaException {
        if (animalCadastroIdade < 0){
            throw new IdadeAnimalNegativaException();
        }
        this.animalCadastroIdade = animalCadastroIdade;
    }

    public Double getAnimalCadastroPeso() {
        return animalCadastroPeso;
    }

    public void setAnimalCadastroPeso(Double animalCadastroPeso) throws PesoAnimalNegativoException {
        if (animalCadastroPeso < 0){
            throw new PesoAnimalNegativoException();
        }
        this.animalCadastroPeso = animalCadastroPeso;
    }

    public Character getAnimalCadastroSexo() {
        return animalCadastroSexo;
    }

    public void setAnimalCadastroSexo(Character animalCadastroSexo) throws SexoAnimalIndefinidoException {
        if (animalCadastroSexo.equals('m') || animalCadastroSexo.equals('f') || animalCadastroSexo.equals('a')){
            this.animalCadastroSexo = animalCadastroSexo;
        }else {
            this.animalCadastroSexo = 'o';
            throw new SexoAnimalIndefinidoException();
        }
    }

    public Character getAnimalCadastroCastrado() {
        return animalCadastroCastrado;
    }

    public void setAnimalCadastroCastrado(Character animalCadastroCastrado) throws AnimalCastradoIndefinidoException {
        if (animalCadastroCastrado.equals('s') || animalCadastroCastrado.equals('n')){
            this.animalCadastroCastrado = animalCadastroCastrado;
        }else {
            this.animalCadastroCastrado = 'n';
            throw new AnimalCastradoIndefinidoException();
        }
    }
}
