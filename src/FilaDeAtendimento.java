import java.util.ArrayList;

public class FilaDeAtendimento {
    ArrayList<FichaCadastralAnimal> filaDeEmergencia;
    ArrayList<FichaCadastralAnimal> filaDeUrgencia;
    ArrayList<FichaCadastralAnimal> filaDePoucaUrgencia;
    ArrayList<FichaCadastralAnimal> filaNaoUrgente;

    public ArrayList<FichaCadastralAnimal> getFilaDeEmergencia() {
        return filaDeEmergencia;
    }

    public void setFilaDeEmergencia(ArrayList<FichaCadastralAnimal> filaDeEmergencia) {
        this.filaDeEmergencia = filaDeEmergencia;
    }

    public ArrayList<FichaCadastralAnimal> getFilaDeUrgencia() {
        return filaDeUrgencia;
    }

    public void setFilaDeUrgencia(ArrayList<FichaCadastralAnimal> filaDeUrgencia) {
        this.filaDeUrgencia = filaDeUrgencia;
    }

    public ArrayList<FichaCadastralAnimal> getFilaDePoucaUrgencia() {
        return filaDePoucaUrgencia;
    }

    public void setFilaDePoucaUrgencia(ArrayList<FichaCadastralAnimal> filaDePoucaUrgencia) {
        this.filaDePoucaUrgencia = filaDePoucaUrgencia;
    }

    public ArrayList<FichaCadastralAnimal> getFilaNaoUrgente() {
        return filaNaoUrgente;
    }

    public void setFilaNaoUrgente(ArrayList<FichaCadastralAnimal> filaNaoUrgente) {
        this.filaNaoUrgente = filaNaoUrgente;
    }
}
