public class MenuFichaCadastralPessoa implements InterfaceMenuCadastro {
    public MenuFichaCadastralPessoa() {
        System.out.println("\n\nMenu (A): Gerenciamento de Fichas Cadastrais de Pessoas");
        Integer repetirMenu = 0;

        do {
            repetirMenu = 0;
            System.out.println("\n(A) Cadastrar nova ficha cadastral: Funcionario");
            System.out.println("(B) Cadastrar nova ficha cadastral: Tutor");
            System.out.println("(C) Remover uma ficha cadastral");
            System.out.println("(X) Sair do Menu");
            Leitura leitor = new Leitura();
            Character opcaoMenu = leitor.input("\nInsira a opção desejada: ").toLowerCase().charAt(0);
            switch (opcaoMenu){
                case 'a':
                    System.out.println("\nOpcao A Escolhida");
                    inserirNovaFichaCadastral(opcaoMenu);
                    System.out.println("\nFicha Cadastrada com Sucesso!");
                    break;
                case 'b':
                    System.out.println("\nOpcao B Escolhida");
                    inserirNovaFichaCadastral(opcaoMenu);
                    System.out.println("\nFicha Cadastrada com Sucesso!");
                    break;
                case 'c':
                    System.out.println("\nOpcao C Escolhida");
                    removerFichaCadastral();
                    System.out.println("\nFicha Removida com Sucesso");
                case 'x':
                    System.out.println("\nSair do Menu");
                    break;
                default:
                    System.out.println("Opcao errada! Tentar novamente.");
                    repetirMenu = 1;
                    break;
            }
        } while (repetirMenu.equals(1));
    }
    private void inserirNovaFichaCadastral(Character opcaoMenu) {
        switch (opcaoMenu){
            case 'a':
                FichaCadastralFuncionario novaFichaFuncionario = new FichaCadastralFuncionario();
            case 'b':
                FichaCadastralTutor novaFichaTutor = new FichaCadastralTutor();
        }
    }
    private void removerFichaCadastral() {
        //TODO: Construir a função de remoção da Ficha, utilizando o DBAnimal
    }
}
