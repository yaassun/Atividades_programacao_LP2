/*
a) O que acontece quando a ação da linha 5 é executada?
R = A linha está instanciando um objeto da classe Funcionario por meio do construtor, 
passando os parametros pedidos (nome, salario base e horas trabalhadas). Tudo isso
é armazenado na variavel f1.

b) Porque construção das linhas 7 e 8 é permitida?
R = Pois os atributos RG e CPF estão declarados como public, sendo assim possivel 
acessá-los e modificá-los em outra classe por meio do objeto f1.

c) Nas linhas 9 e 10,  acessamos os atributos salário e matricula da funcionário. Essa
construção implementada nas linhas 9 e 10 é permitida pelo objeto funcionário?
Justifique a sua resposta
R = Não, já que eles são privados e o acesso viola o encapsulamento. Os atributos não 
devem ser modificados diretamente: a matricula deve ser gerada a partir do atributo estatico 
geraMatricula e salario deve ser alterado somente pelo metodo calculaSalario. 

*/