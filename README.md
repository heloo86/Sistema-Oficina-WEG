# Sistema Oficina WEG

## Proposta
Refatora o código monolitico entregue pelo professor. 

  [-> Código monolitico <-](file:///C:/Users/heloisa_a_ferreira/Downloads/Anexo%2001%20-%20C%C3%B3digo%20fonte%20do%20sistemas%20SistemaOficinaWegCompleto.pdf)

## Problemas Observados
Na versão antiga do sistema é possóvel observar uma série de defeitos que ferem os principios SOLID. 
-  O código se concentra em apenas uma classe responsável por todos os processo de todas as entidades, ou seja, fere o principio de **Single Responsability**.
-  O gerenciamento do menu ocorre em um switch-case, onde cada processo é detalhado em um case. Dessa forma, caso uma nova funcionalidae seja adicinada, é preciso criar mais um case, com mais um processo. Isso gera uma classe que precisa ser modificada sempre que uma nova funcionalidade é agregada, ferindo assim o **Open Closed Principle**.
-  A classse unica não aproveita os recurso da POO adequadamento, sendo assim não utiliza de Interfaces ou Heranças para melhorar processos, ou seja, não aplica o **Liskov Substitution Principle** nem **InterFace Segrgation Principle**.
-  As diferentes entidades, bem como o banco de dados estão na mesma classe tornando os elementos fortemente acoplados. Dessa forma fere o principio do **Dependence Invertion Principle**.
