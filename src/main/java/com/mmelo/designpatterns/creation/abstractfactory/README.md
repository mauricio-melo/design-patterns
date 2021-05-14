
# Abstract Factory

O Abstract Factory é um padrão que fornece uma interface para criar famílias de objetos dependentes ou relacionados sem especificar suas classes concretas

Neste padrão tem-se um mecanismo de encapsulamento para agrupar fábricas individuais. Neste processo, uma interface é usada para criar objetos relacionados, assim não é possível chamar diretamente a classe concreta.

O benefício do padrão Abstract Factory é a possibilidade de trocar as implementações concretas sem alterar o código do usuário. O ponto negativo é que o debugging se torna bastante complexo.

Este padrão é utilizado quando o sistema não precisa se preocupar sobre como os produtos devem ser criados ou compostos, quando queremos lidar com várias fábricas mais facilmente, separar classes concretas e fazer a troca de produtos mais facilmente.