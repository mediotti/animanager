//Nome: Gabriel Mediotti Marques
//RA: 2266377
public class MenuFichaCadastralAnimal implements InterfaceMenuCadastro{

    public MenuFichaCadastralAnimal(){
        System.out.println("Menu (B): Gerenciamento de Fichas Cadastrais Animais");
        boolean repetirMenu = false;
        do {
            repetirMenu = false;
            System.out.println("(A) Cadastrar uma nova ficha cadastral animal.");
            System.out.println("(B) Remover uma ficha cadastral animal");
            System.out.println("(X) Sair do Menu");
            Leitura leitor = new Leitura();
            Character opcaoMenu = leitor.input("\nInsira a opção desejada: ").toLowerCase().charAt(0);
            switch (opcaoMenu){
                case 'a':
                    System.out.println("\nOpcao A Escolhida");
                    inserirNovaFichaCadastral();
                    break;
                case 'b':
                    System.out.println("\nOpcao B Escolhida");
                    removerFichaCadastral(leitor.input("Insira o ID da ficha cadastral animal que deseja remover: "));
                    break;
                case 'x':
                    System.out.println("\nSair do Menu!");
                    break;
                default:
                    System.out.println("Opcão errada! Tentar novamente.");
                    repetirMenu = true;
                    break;
            }
        } while (repetirMenu);

    }

    private void inserirNovaFichaCadastral() {
        FichaCadastralAnimal novaFichaAnimal = new FichaCadastralAnimal();
    }

    private void removerFichaCadastral(String idFicha) {
        //TODO: Construir a função de remoção da Ficha, utilizando o DBAnimal
    }
}
