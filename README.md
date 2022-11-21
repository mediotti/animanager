# Sistema de Gerenciamento de Internos de um Hospital Veterinário
Projeto desenvolvido durante a disciplina de Programação Orientada a Objetos (AS32A)
## Objetivos Gerais:
  - Aplicar os conceitos da Programação Orientada a Objetos em um projeto prático;
  - Compreender as regras de negócio e desenvolver uma solução que atenda-as.
## Regras de Negócio:
  - Os animais respeitam uma prioridade de atendimento, no momento do cadastro de uma nova ficha médica, deverá ser determinado uma grau de emergência conforme a tabela abaixo:

  | Prioridade |    Descrição   |
  |:----------:|:--------------:|
  |      A     |   Emergência   |
  |      B     |    Urgência    |
  |      C     | Pouca Urgência |
  |      D     |   Não Urgente  | 
  
  - Cada tutor deverá ter uma ficha cadastral, contendo as seguintes informações:
    - Nome;
    - Telefone;
    - Endereço;
    - CPF;
  - Cada funcionário deverá ter uma ficha cadastral, contendo as seguintes informações:
    - Nome;
    - Endereço;
    - CPF;
    - Cargo;
    - Setor;    
  - Cada animal terá uma ficha cadastral e uma ficha médica, contendo as seguintes informações:
    - Cadastral
      - Nome;
      - Sexo;
      - Idade;
      - Espécie e Raça;
      - É castrado ou não
      - Ficha Cadastral do Tutor.
    - Médica
      - Prioridade de Atendimento;
      - Setor e Baia;
      - Sintomas;
      - Procedimentos realizados; 
      - Ficha Cadastral do Funcionário Responsável;
      - Status;
  
## Decisões de Negócios do Projeto
- No procedimento de edição de fichas médicas (fichas referentes aos pacientes durante o atendimento deles), será possível somente alterar a **Prioridade** e o **Status** dessas fichas.
- A maioria das janelas do projeto contam com um botão **"Cancelar"**, ele será responsável por retornar ao menu inicial do programa.
