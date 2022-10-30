import java.util.ArrayList;

public class FichaMedicaAnimal {
    Character animalFichaPrioridade;
    Character animalFichaSetor;
    Character animalFichaBaia;
    FichaCadastralFuncionario animalFichaResponsavel;
    ArrayList<String> animalFichaSintomas;
    ArrayList<String> animalFichaProcedimentosRealizados;
    String animalFichaStatus;
    FichaMedicaAnimalParametros parametros;

    public FichaMedicaAnimalParametros getParametros() {
        return parametros;
    }

    public void setParametros(FichaMedicaAnimalParametros parametros) {
        this.parametros = parametros;
    }

    public Character getAnimalFichaPrioridade() {
        return animalFichaPrioridade;
    }

    public void setAnimalFichaPrioridade(Character animalFichaPrioridade) {
        this.animalFichaPrioridade = animalFichaPrioridade;
    }

    public Character getAnimalFichaSetor() {
        return animalFichaSetor;
    }

    public void setAnimalFichaSetor(Character animalFichaSetor) {
        this.animalFichaSetor = animalFichaSetor;
    }

    public Character getAnimalFichaBaia() {
        return animalFichaBaia;
    }

    public void setAnimalFichaBaia(Character animalFichaBaia) {
        this.animalFichaBaia = animalFichaBaia;
    }

    public FichaCadastralFuncionario getAnimalFichaResponsavel() {
        return animalFichaResponsavel;
    }

    public void setAnimalFichaResponsavel(FichaCadastralFuncionario animalFichaResponsavel) {
        this.animalFichaResponsavel = animalFichaResponsavel;
    }

    public ArrayList<String> getAnimalFichaSintomas() {
        return animalFichaSintomas;
    }

    public void setAnimalFichaSintomas(ArrayList<String> animalFichaSintomas) {
        this.animalFichaSintomas = animalFichaSintomas;
    }

    public ArrayList<String> getAnimalFichaProcedimentosRealizados() {
        return animalFichaProcedimentosRealizados;
    }

    public void setAnimalFichaProcedimentosRealizados(ArrayList<String> animalFichaProcedimentosRealizados) {
        this.animalFichaProcedimentosRealizados = animalFichaProcedimentosRealizados;
    }

    public String getAnimalFichaStatus() {
        return animalFichaStatus;
    }

    public void setAnimalFichaStatus(String animalFichaStatus) {
        this.animalFichaStatus = animalFichaStatus;
    }
}
