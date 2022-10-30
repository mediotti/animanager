public class MenuFichaCadastralPessoa implements InterfaceMenuCadastro {
    Character opcaoPessoa;

    public MenuFichaCadastralPessoa() {
        System.out.println("\n\n\n\tMenu (A): Gerenciamento de Fichas Cadastrais de Pessoas");
        Integer repetirMenu = 0;

        do {
            repetirMenu = 0;
            System.out.println("(A) Cadastrar nova ficha cadastral: Funcionario");
            System.out.println("(B) Cadastrar nova ficha cadastral: Tutor");
            System.out.println("(X) Sair do Menu");
            Leitura leitor = new Leitura();
            Character opcaoMenu = leitor.input("\nInsira a opção desejada: ").toLowerCase().charAt(0);
            switch (opcaoMenu){
                case 'a':
                    System.out.println("\nOpcao A Escolhida");
                    break;
                case 'b':
                    System.out.println("\nOpcao B Escolhida");
                    break;
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

    public Character getOpcaoPessoa() {
        return opcaoPessoa;
    }
    public void setOpcaoPessoa(Character opcaoPessoa) {
        this.opcaoPessoa = opcaoPessoa;
    }
    public void inserirNovaFichaCadastral() {
    }
    public void removerFichaCadastral() {
    }
}
