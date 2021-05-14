
# Memento

O Memento é um padrão de projeto comportamental que permite tirar um “retrato” do estado de um objeto e restaurá-lo no futuro.

- originator: o objeto para o qual o estado deve ser salvo. Ele cria o memento e o usa no futuro para desfazer.
- memento: o objeto que vai manter o estado de originador. É apenas um POJO.
- caretaker: o objeto que mantém o controle de várias lembranças. Como manter pontos de salvamento.