<p style="text-align: center;"><font size="5"><b>Git Exercícios</b></font></p1></p>
<DIV align="justify">

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git? 

git --version

2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help

  lista os comandos mais usados do git

  b. git help checkout

  fornece a documentação relativa ao comando checkout

  c. git help merge

  fornece a documentação relativa ao comando checkout

  d. git init

  Cria um repositorio vazio ou reinicializa um existente

  e. git add --all

  adiciona todos arquivos ao index

  f. git add -u

  atualiza o index apenas onde existe alguma entidade correspondente, não adiciona novos arquivos

  g. git config -l

  lista todas configurações e seus valores do arquivo config

  h. git mv a.txt b.txt

  renomeia o arquivo a.txt para b.txt

  i. git reset --hard

  reseta o index e a arvore de trabalho, qualquer alteração é perdida

  j. git log -27

  mostras a listagem de comits

3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?

git add e git commit, respectivamente

4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?

git diff

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?

git status

6. Qual o comando para efetuar um _commit_?

git commit

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?

git checkout teste.txt

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.

Caso o arquivo não esteja sendo "tracked" pelo git, basta criar ou editar o arquivo .gitignore e adicioner o nome do diretório em uma linha do arquivo. Caso o arquivo esteja sendo "tracked", é necessário realizar os seguintes comandos:
git rm --cached <arquivo> (para arquivos)
git rm -r --cached <pasta> (para diretorios/pastas)
git commit
Após isso realizar como se fosse um arquivo "untracked"

9. O que acontece se o seu repositório local for acidentalmente removido?

Caso não seja realizado commits, apenas as alterações não commitadas serão perdidas.

10. Como clonar um repositório remoto?

git clone <repositorio> para criar um repositorio igual ao repositorio especificado

git pull para poder puxar as alterações para outro

11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?

git log --oneline 

12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?

gitconfig

13. Qual o comando para criar um repositório local?

git init

14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?

.git

15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)

git add --all

16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?

SHA1 é capaz de através de alguns dados, gerar uma hash de 40 caracteres. Isso permite que o git identifique qualquer mudança que ocorra nos arquivos, seja por alterações ou algum erro na transferencia de dados.

17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?

 -abbrev-commit

18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?

não, git add -u não adiciona arquivos novos

19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**

O primeiro volta ao último commit e mantém os últimos arquivos no Stage
O segundo reseta o indice e a arvore de trabalho, deletando qualquer mudança

20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?

git clean

21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?

.gitignore

22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?

adicionar no .gitignore "*.class"

23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.



24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?

 1714  John Resig <jeresig@gmail.com>
   696  Timmy Willison <4timmywil@gmail.com>
   587  Dave Methvin <dave.methvin@gmail.com>
   395  Micha<C5><82> Go<C5><82><C4><99>biowski-Owczarek <m.goleb@gmail.com>
   336  J<C3><B6>rn Zaefferer <joern.zaefferer@gmail.com>
   332  Julian Aubourg <aubourg.julian@gmail.com>
   315  Rick Waldron <waldron.rick@gmail.com>
   277  Richard Gibson <richard.gibson@gmail.com>
   269  Oleg Gaidarenko <markelog@gmail.com>
   250  Brandon Aaron <brandon.aaron@gmail.com>
   200  Ariel Flesler <aflesler@gmail.com>
    85  Mike Sherov <mike.sherov@gmail.com>
    71  Colin Snover <github.com@zetafleet.com>
    67  David Serduke <davidserduke@gmail.com>
    59  Yehuda Katz <wycats@gmail.com>
    55  Corey Frang <gnarf37@gmail.com>
    47  Louis-R<C3><A9>mi Bab<C3><A9> <lrbabe@gmail.com>
    35  Anton Matzneller <obhvsbypqghgc@gmail.com>
    34  Scott Gonz<C3><A1>lez <scott.gonzalez@gmail.com>
    28  Timo Tijhof <krinklemail@gmail.com>
    27  Gilles van den Hoven <gilles0181@gmail.com>
    22  Robert Kati<C4><87> <robert.katic@gmail.com>
    18  Jason Bedard <jason+github@jbedard.ca>
    17  Dan Heberden <danheberden@gmail.com>
    15  Carl F<C3><BC>rstenberg <azatoth@gmail.com>
    12  Ben Alman <cowboy@rj3.net>
    12  Karl Swedberg <kswedberg@gmail.com>
    11  Jordan Boesch <jboesch26@gmail.com>
    11  Mike Alsup <malsup@gmail.com>

  
25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?

origin  https://github.com/jquery/jquery.git (fetch)
origin  https://github.com/jquery/jquery.git (push)

26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?

git tag

27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?

git tag -l "2.0*"

28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?

cria uma tag "3.4-gold" com mensagem "minha versão ouro"

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?

retorna os dados da tag "3.4-gold"

30. O que o comando **git push origin 3.4-gold** teria como efeito?

atualiza o repositorio remoto apartir do local  com a tag "3.4-gold"

31. Após executar um commit, qual o efeito de **git commit --amend**?

Adiciona alterações ao ultimo commit

32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?

as mudanças em x.txt não serão commitadas

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?

as mudanças serão revertidas, ou o arquivo será removido

34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?

git reset HEAD a.txt retira o arquivo do index, git checkout -- a.txt rever o arquivo para o estado do ultimo commit

35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.

executado em jquery:
diff --git a/src/manipulation.js b/src/manipulation.js
index f86bd9ab..19c60fcb 100644
--- a/src/manipulation.js
+++ b/src/manipulation.js
@@ -25,9 +25,7 @@ var

        // Support: IE <=10 - 11+
        // In IE using regex groups here causes severe slowdowns.
-       rnoInnerhtml = /<script|<style|<link/i,
-
-       rcleanScript = /^\s*<!(?:\[CDATA\[|--)|(?:\]\]|--)>\s*$/g;
+       rnoInnerhtml = /<script|<style|<link/i;

 // Prefer a tbody over its parent table for containing new rows
 function manipulationTarget( elem, content ) {
@@ -161,7 +159,7 @@ function domManip( collection, args, callback, ignored ) {
                                                                }, doc );
                                                        }
                                                } else {
-                                                       DOMEval( node.textContent.replace( rcleanScript, "" ), node, doc );
+                                                       DOMEval( node.textContent, node, doc );
                                                }
                                        }
                                }
diff --git a/test/data/cleanScript.html b/test/data/cleanScript.html
index c37694aa..60d235b8 100644
--- a/test/data/cleanScript.html
+++ b/test/data/cleanScript.html
