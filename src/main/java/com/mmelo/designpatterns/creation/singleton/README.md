
# Singleton

O padrão Factory tem duas variações: Factory Method e Abstract Factory e a intenção desses é fornecer uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.

Portanto, o padrão Factory possibilita desacoplar objetos de criação do sistema subjacente através do encapsulamento do código responsável pela criação de objetos. Isso tem como resultado também uma maior simplificação para os desenvolvedores quando é necessária a realização de refatoração no código, pois agora existe um único ponto onde as alterações podem ocorrer.


O padrão Factory Method usa herança e depende de uma subclasse para lidar com a instanciação do objeto desejado. A citação assume que um objeto está chamando seu próprio método de fábrica aqui. Portanto, a única coisa que poderia alterar o valor de retorno seria uma subclasse.

A fábrica abstrata é um objeto que contém vários métodos de fábrica. Olhando para a primeira metade da sua cotação:
com o padrão Abstract Factory, uma classe delega a responsabilidade da instanciação do objeto para outro objeto via composição