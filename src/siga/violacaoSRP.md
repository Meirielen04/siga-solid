a classe relatorioAluno tem métodos que podem ter só própria classe para alta coesao e baixo acoplamento:

- método de salvarEmArquivo o ideal é ter sua própria classe ou interface, assim como enviarPoremail, porque são funções auxiliadores para criar o relatório
- É melhor manter apenas informações que possuem dentro do relatório para melhor organização

Portando, existe violação de SRP já que tem funcionalidades diferentes numa mesma classe