
# Visitor

O padrão de visitante é usado quando temos que realizar uma operação em um grupo de objetos semelhantes. Com a ajuda do padrão de visitante, podemos mover a lógica operacional dos objetos para outra classe.

Por exemplo, pense em um carrinho de compras onde podemos adicionar diferentes tipos de itens (elementos). Quando clicamos no botão checkout, ele calcula o valor total a ser pago. Agora podemos ter a lógica de cálculo nas classes de itens ou podemos mover essa lógica para outra classe usando o padrão de visitante.


O benefício desse padrão é que, se a lógica de operação mudar, precisamos fazer a mudança apenas na implementação do visitante, em vez de fazer isso em todas as classes de itens.

Outro benefício é que adicionar um novo item ao sistema é fácil, exigirá mudanças apenas na interface do visitante e na implementação, e as classes de itens existentes não serão afetadas.