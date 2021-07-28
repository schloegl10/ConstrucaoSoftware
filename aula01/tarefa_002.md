## Tarefa 002 - 28/07/2021 - Pesquisa Rest API

1. Elaborar uma pesquisa sobre o tema "_Rest API_".
2. Elaborar um texto de pelo menos uma página, descrito com suas próprias palavras, destacando:
* As definições dos conceitos envolvidos;
* As principais características deste conceito (pelo menos umas cinco).

## Enunciado

REST consiste no conjunto de regras para criação de web services, visando permitir que web services utilizando REST tenham capacidade de operar entre si caso necessário. Foi criado em 2000 por Roy Fielding em sua tese de douturado. Facilita adecorre pelo fato que as interações entre serviços é feita por um conjunto prédefinido e padronizado de  operações. Tem foco em velocidade, confiabilidade e crescimento com facilidade e rapidez ao permitir reusabilidade e baixo acoplamento. 
REST tem idealiza que todas as comunicações entre sistemas feitas devem conter todas informações que seriam necessárias para a mesma, sem que necessite que algum dos serviços guarde informações anteriores. As informações em cada operação deve informar como devem ser processadas e diferentes de outros tipos de operações existentes. Durante a comunicação entre serviços REST um serviço apenas necessita saber como realizar uma operação e quais serão os padrões do retorno, não necessitando saber de outras peculiaridades da comunicação. Dentro de uma operação estarão contidos hiperlinks que permitem identificar quais são as outras possiveis ações a serem realizadas.
Alguns exemplos de operações são POST, GET, PUT e DELETE. Assim como uma sintaxe universal para identificar os recursos. As comunicações tendem a sempre serem feitas através de arquivos HTML, XML ou JSON, visando novamente facilitar a comunicação entre serviços.
Com intuito de otimizar as omunicações REST é sejam utilizado CACHE para poder agilizar comunicações entre clientes e servidores.
Os sistemas REST são criados em camadas, tendo cada camada seu nivel de segurança e acesso, permitindo ou não acessos. Essas camadas devem ser ocultadas do usuario da API, sendo apenas utilizadas para funções internas.
Alguns exemplos de aplicações do usos de REST são: Amazon, eBay e Yahoo!.
