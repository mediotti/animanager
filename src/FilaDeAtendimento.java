//Nome: Gabriel Mediotti Marques
//RA: 2266377
import java.util.ArrayList;

public class FilaDeAtendimento {
    ArrayList<FichaMedicaAnimal> filaDeEmergencia = new ArrayList<FichaMedicaAnimal>();
    ArrayList<FichaMedicaAnimal> filaDeUrgencia = new ArrayList<FichaMedicaAnimal>();
    ArrayList<FichaMedicaAnimal> filaDePoucaUrgencia = new ArrayList<FichaMedicaAnimal>();
    ArrayList<FichaMedicaAnimal> filaNaoUrgente = new ArrayList<FichaMedicaAnimal>();
    public FilaDeAtendimento(){
        System.out.println("Menu (C): Gerenciamento de Fichas Médicas e Fila de Atendimento");
        System.out.println("\nFila de Emergência: " + getFilaDeEmergencia().toString());
        System.out.println("\nFila de Urgência: " + getFilaDeUrgencia());
        System.out.println("\nFila de Pouca Urgência: " + getFilaDePoucaUrgencia());
        System.out.println("\nFila Não Urgente: " + getFilaNaoUrgente());
        boolean repetirMenu;
        do {
            repetirMenu = false;
            System.out.println("\n\n(A) Inserir nova Ficha Médica.");
            System.out.println("\n(B) Alterar status de uma Ficha Médica.");
            Leitura leitor = new Leitura();
            Character opcaoMenu = leitor.input("\nInsira a opção desejada: ").toLowerCase().charAt(0);
            switch (opcaoMenu){
                case 'a':
                    FichaMedicaAnimal novaFichaMedicaAnimal = new FichaMedicaAnimal();
                    switch (novaFichaMedicaAnimal.getAnimalFichaPrioridade()){
                        case 'a':
                            getFilaDeEmergencia().add(novaFichaMedicaAnimal);
                            break;
                        case 'b':
                            getFilaDeUrgencia().add(novaFichaMedicaAnimal);
                            break;
                        case 'c':
                            getFilaDePoucaUrgencia().add(novaFichaMedicaAnimal);
                            break;
                        case 'd':
                            getFilaNaoUrgente().add(novaFichaMedicaAnimal);
                            break;
                    }
                    break;
                case 'b':
                    System.out.println("Alterar status de uma ficha médica");
                    String idFicha = leitor.input("Insira o ID da ficha que deseja alterar o Status: ");
                    //TODO: Construir a função de busca da ficha nas filas de atendimento e atualização do status da mesma (Sugestão: criar uma lista que armazena todas as fichas, mais fácil buscar por lá.
                    break;
                default:
                    System.out.println("Opcão errada! Tentar novamente.");
                    repetirMenu = true;
            }
        } while (repetirMenu);
    }

    public ArrayList<FichaMedicaAnimal> getFilaDeEmergencia() {
        return filaDeEmergencia;
    }

    public ArrayList<FichaMedicaAnimal> getFilaDeUrgencia() {
        return filaDeUrgencia;
    }

    public ArrayList<FichaMedicaAnimal> getFilaDePoucaUrgencia() {
        return filaDePoucaUrgencia;
    }

    public ArrayList<FichaMedicaAnimal> getFilaNaoUrgente() {
        return filaNaoUrgente;
    }
    }
