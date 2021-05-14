
# Observer

o padrão Observer define uma dependência de um para muitos entre os objetos, em que quando tem-se uma alteração no estado de um objeto, todas as dependências são notificadas e atualizadas automaticamente.

O objeto que alterou o seu estado é chamado de Subject (Sujeito) e os objetos que receberam a notificação da alteração são chamados de Observers (Observadores). Como pode-se notar, o relacionamento é de um para muitos (ou one-to-many), na qual o Subject pode ter muitos Observers.