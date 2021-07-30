## Tarefa 002 - 28/07/2021 - Pesquisa Rest API

1. Elaborar uma pesquisa sobre o tema "_Rest API_".
2. Elaborar um texto de pelo menos uma página, descrito com suas próprias palavras, destacando:
* As definições dos conceitos envolvidos;
* As principais características deste conceito (pelo menos umas cinco).

## Enunciado

APIs são ferramentas que permitem a comunicação entre serviços webs através de um conjunto de ações definidas. Um exemplo seria APIs de empresas de pagamento de compras online em determiados sites.

REST consiste no conjunto de regras para criação de API em web services, visando permitir que web services utilizando REST tenham capacidade de operar entre sem problemas de incomptatibilidade. A facilidade decorre do fato que as interações entre serviços ficam estabelecidas em um conjunto prédefinido e padronizado de  operações.

Os principais focos do REST API é na velocidade (decorrente de mensagens simples em formatos leves e utilizando CACHE), confiabilidade (devido a padronização os retornos são faceis de serem determinados com base nas requisições) e crescimento com facilidade, reusabilidade e baixo acoplamento. 

Em 2000 Roy Fielding buscando criar um padrão para poder facilitar as criações e utilizações de APIs, criou o REST API.

Alguns pontos principais da arquitetura do REST são:

- As comunicações são chamadas de Stateless, o que indica que cada operação deve conter todas informações que seriam necessárias para a realizar a mesma, sem que necessite que algum dos usuarios do serviços guarde informações de outras operações anteriores, para a interperetação dos resultados recebidos.

- As informações em cada operação deve informar como devem ser processadas e diferentes de outros tipos de operações existentes.

- Ao ser realizada uma operação é necessário estabelecer de forma clara a relação cliente-servidor. Na qual um lado envia as informações que foram requisitadas por outro.

- Durante a comunicação entre serviços REST um serviço apenas necessita saber como realizar uma operação e quais serão os padrões do retorno, não necessitando saber de outras peculiaridades da comunicação.

- Dentro de uma operação estarão contidos hiperlinks que permitem identificar quais são as outras possiveis ações a serem realizadas.

- A interface de comunicação do REST é unificada, utilizando comunicação HTTP, por formatos HTML, XML ou JSON. O formato mais utilizado normalmente é o JSON, que permite leitura simples de maquina e de seres humanos. As operações também são bem determinadas e simples, alguns exemplos são: POST, GET, PUT e DELETE.

- Com intuito de otimizar as omunicações REST é sejam utilizado CACHE para poder agilizar comunicações entre clientes e servidores.

- Os sistemas REST são criados em camadas, tendo cada camada seu nivel de segurança e acesso, permitindo ou não acessos. Essas camadas devem ser ocultadas do usuario da API, sendo apenas utilizadas para funções internas.

Alguns exemplos de aplicações do usos de REST são: Amazon, eBay e Yahoo!.
