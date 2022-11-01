//Nome: Gabriel Mediotti Marques
//RA: 2266377
import java.util.ArrayList;

public class FichaMedicaAnimal {
    String idFichaCadastralAnimal;
    Character animalFichaPrioridade;
    Character animalFichaSetor;
    Character animalFichaBaia;
    String animalFichaResponsavel;
    ArrayList<String> animalFichaSintomas = new ArrayList<>();
    ArrayList<String> animalFichaProcedimentosRealizados = new ArrayList<>();
    Character animalFichaStatus;
    FichaMedicaAnimalParametros animalFichaParametros;

    Leitura leitor = new Leitura();

    public FichaMedicaAnimal(){
        System.out.println("\nNova ficha Médica");
        setIdFichaCadastralAnimal();
        setAnimalFichaPrioridade();
        setAnimalFichaSetorBaia();
        setAnimalFichaResponsavel();
        setAnimalFichaParametros();
        setAnimalFichaSintomas();
        setAnimalFichaProcedimentosRealizados();
        setAnimalFichaStatus();
    }

    private void setIdFichaCadastralAnimal() {
        idFichaCadastralAnimal = leitor.input("Insira o id da Ficha Cadastral do Animal: ");
    }

    private String getIdFichaCadastralAnimal(){
        return idFichaCadastralAnimal;
    }

    public FichaMedicaAnimalParametros getAnimalFichaParametros() {
        return animalFichaParametros;
    }

    public void setAnimalFichaParametros() {
        animalFichaParametros = new FichaMedicaAnimalParametros();
    }

    public Character getAnimalFichaPrioridade() {
        return animalFichaPrioridade;
    }

    public void setAnimalFichaPrioridade() {
        System.out.println("\n(A) Emergencia\n(B) Urgencia\n(C) Pouca Urgencia\n(D) Não Urgente");
        animalFichaPrioridade = leitor.input("Insira a prioridade do animal: ").toLowerCase().charAt(0);
    }

    public void setAnimalFichaSetorBaia() {
        System.out.println("A - B - C - D - E");
        animalFichaSetor = leitor.input("Insira o setor do animal: ").toLowerCase().charAt(0);
        System.out.println("1 - 10");
        animalFichaBaia = leitor.input("Insira a baia do animal: ").charAt(0);
    }

    public Character getAnimalFichaSetor() {
        return animalFichaSetor;
    }

    public Character getAnimalFichaBaia() {
        return animalFichaBaia;
    }

    public String getAnimalFichaResponsavel() {
        return animalFichaResponsavel; //TODO: Corrigir o retorno para um objeto tipo FichaCadastralFuncionario de acordo com o ID recebido na chamada da função
    }

    public void setAnimalFichaResponsavel() {
        animalFichaResponsavel = leitor.input("Insira o funcionário responsável pelo animal: ");
    }

    public ArrayList<String> getAnimalFichaSintomas() {
        return animalFichaSintomas;
    }

    public void setAnimalFichaSintomas() {
        char repetirSintomas = 'n';
        animalFichaSintomas.add("");
        do {
            animalFichaSintomas.add(leitor.input("Insira o procedimento realizado: "));
            System.out.println("Inserir novo sintoma: ");
            repetirSintomas = leitor.input("(S) Sim \n(N) Não").toLowerCase().charAt(0);
        } while (repetirSintomas == 's');
    }

    public ArrayList<String> getAnimalFichaProcedimentosRealizados() {
        return animalFichaProcedimentosRealizados;
    }

    public void setAnimalFichaProcedimentosRealizados() {
        char repetirProcedimentoRealizado = 'n';
        do {
            animalFichaProcedimentosRealizados.add(leitor.input("Insira o procedimento realizado: "));
            System.out.println("Inserir novo procedimento realizado: ");
            repetirProcedimentoRealizado = leitor.input("(S) Sim \n(N) Não").toLowerCase().charAt(0);
        } while (repetirProcedimentoRealizado == 's');
    }

    public Character getAnimalFichaStatus() {
        return animalFichaStatus;
    }

    public void setAnimalFichaStatus() {
        System.out.println("\n(A)Em atendimento\n(B)Liberado\n(C)Óbito");
        animalFichaStatus = leitor.input("Insira o status do animal:").toLowerCase().charAt(0);
    }
}
