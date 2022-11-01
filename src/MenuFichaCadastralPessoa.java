//Nome: Gabriel Mediotti Marques
//RA: 2266377
public class MenuFichaCadastralPessoa implements InterfaceMenuCadastro {
    public MenuFichaCadastralPessoa() {
        System.out.println("\n\nMenu (A): Gerenciamento de Fichas Cadastrais de Pessoas");
        Integer repetirMenuRaiz;

        do {
            repetirMenuRaiz = 0;
            System.out.println("\n(A) Cadastrar nova ficha cadastral: Funcionario");
            System.out.println("(B) Cadastrar nova ficha cadastral: Tutor");
            System.out.println("(C) Remover uma ficha cadastral");
            System.out.println("(X) Sair do Menu");
            Leitura leitor = new Leitura();
            boolean repetirMenu = true;
            Character opcaoMenu = leitor.input("\nInsira a opção desejada: ").toLowerCase().charAt(0);
            switch (opcaoMenu){
                case 'a':
                    System.out.println("\nOpcao A Escolhida");
                    while (repetirMenu){
                        repetirMenu = inserirNovaFichaCadastral(opcaoMenu, repetirMenu);
                        System.out.println("\nFicha Cadastrada com Sucesso!");
                    }
                    break;
                case 'b':
                    System.out.println("\nOpcao B Escolhida");
                    while (repetirMenu) {
                        repetirMenu = inserirNovaFichaCadastral(opcaoMenu, repetirMenu);
                        System.out.println("\nFicha Cadastrada com Sucesso!");

                    }
                    break;
                case 'c':
                    System.out.println("\nOpcao C Escolhida");
                    while (repetirMenu) {
                        removerFichaCadastral();
                    }
                    System.out.println("\nFicha Removida com Sucesso");
                case 'x':
                    System.out.println("\nSair do Menu");
                    break;
                default:
                    System.out.println("Opcao errada! Tentar novamente.");
                    repetirMenuRaiz = 1;
                    break;
            }
        } while (repetirMenuRaiz.equals(1));
    }
    private boolean inserirNovaFichaCadastral(Character opcaoMenu, boolean repetirMenu) {
        do {
            switch (opcaoMenu){
                case 'a':
                    FichaCadastralFuncionario novaFichaFuncionario = new FichaCadastralFuncionario();
                    repetirMenu = false;
                    break;
                case 'b':
                    FichaCadastralTutor novaFichaTutor = new FichaCadastralTutor();
                    repetirMenu = false;
                    break;
            }
        } while (repetirMenu);
        return repetirMenu;
    }
    private void removerFichaCadastral() {
        //TODO: Construir a função de remoção da Ficha, utilizando o DBAnimal
    }
}
