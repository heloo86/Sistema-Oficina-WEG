# Sistema Oficina WEG

## Proposta
Refatorar o código monolítico entregue pelo professor. 

## Problemas Observados
Na versão antiga do sistema é possível observar uma série de defeitos que ferem os princípios SOLID. 
-  O código se concentra em apenas uma classe responsável por todos os processo de todas as entidades, ou seja, fere o princípio de **Single Responsability**.
-  O gerenciamento do menu ocorre em um switch-case, onde cada processo é detalhado em um case. Dessa forma, caso uma nova funcionalidae seja adicinada, é preciso criar mais um case com mais um processo. Isso gera uma classe que precisa ser modificada sempre que uma nova funcionalidade é agregada, ferindo assim o **Open Closed Principle**.
-  A classse unica não aproveita os recurso da POO adequadamente, sendo assim não utiliza de Interfaces ou Heranças para melhorar processos, ou seja, não aplica o **Liskov Substitution Principle** nem **Interface Segrgation Principle**.
-  As diferentes entidades, bem como o banco de dados estão na mesma classe tornando os elementos fortemente acoplados. Dessa forma fere o principio do **Dependence Invertion Principle**.

 ## A solução desenvolvida
  Deante de um sitema acoplado e monolítico, a solução elaborada consiste em uma API que realisa os mesmos processo porém de forma mais eficiente. No novo código há a separação das entidades e para cada uma delas classes com responsabilidades únicas., por exemplo o repositry para lidar com as operações do banco de dados e service, para lidar com a lógica e regras de negócio.
  
### SOLID no novo código:
- **Single Responsability Principle** pois cada classe possui reponsabilidade unica e clara. Ex.: Mapper, que é dedicado exclusivamente a conversão de DTOs e Entidades.
- **Open Closed Principle** pois caso uma nova funcionalidade seja umplementada, basta adicionar um novo método no service sem necessidade de editar o que já esta pronto.
- **Liscov Substitution Principle** não foi aplicado pois a estrutura modular utilizada não exige heranças
- **Interface Segregation e Dependence Inversion Principle** foram aplicados no repository pois cada um deles é uma interface que deve ser implementada na classe que lida diretamente com as transições do banco. Assim o service lida apenas com o "que" em quanto a classe que implementa a interface repository lida com o "como". Dessa forma o service não depende da lógica do banco, a lógica de infra estrutura é que depende do que o service precisa.
