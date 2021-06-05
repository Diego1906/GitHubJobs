# GitHubJobs
O App busca as vagas disponíveis na plataforma do GitHub através de consumo de API.

No Design de Arquitetura do projeto foi utilizado o conceito [MVVM + Clean Architecture](https://proandroiddev.com/mvvm-with-clean-architecture-c2c021e05c89).

API utilizada [The GitHub Jobs API](https://jobs.github.com/api).

**O aplicativo possui duas telas e elas são:**
  - 1º Tela que apresenta a lista de vagas.
  - 2º Tela de detalhes da vaga selecionada.

**No desenvolvimento do projeto foram utilizadas as tecnologias descritas abaixo:**

- Linguagem de Programação
  - 
  - Kotlin.
  
- Componentes de Arquitetura, Bibliotecas Internas e Jetpack
  -
  - Documentação
    - 
    - [Fragment](https://developer.android.com/jetpack/androidx/releases/fragment).
    - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel#sharing).
    - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata).
    - [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle).
    - [Android KTX](https://developer.android.com/kotlin/ktx).
    - [Databinding](https://developer.android.com/jetpack/androidx/releases/databinding).
    - [Navigation](https://developer.android.com/jetpack/androidx/releases/navigation).
    - [Hilt](https://developer.android.com/jetpack/androidx/releases/hilt).
    - [RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview).
    - [Material Design](https://material.io/).
    - [ConstraintLayout](https://developer.android.com/training/constraint-layout).
    - [Coroutines](https://developer.android.com/kotlin/coroutines?gclid=Cj0KCQjwhr2FBhDbARIsACjwLo1AReUTR-2dgLGqHoXs2xytukd0yq6GVTSV5neH1ARYCqmHpt5LwIkaAok4EALw_wcB&gclsrc=aw.ds).
    
- Bibliotecas Externas
  - 
  - [Retrofit](https://square.github.io/retrofit/) é utilizada para fazer requisições HTTP a serviços Web.
  - [Moshi](https://github.com/square/moshi) é uma moderna biblioteca JSON para Android, Kotlin e Java. Ela faz de forma fácil a conversão de um JSON para objetos Kotlin e Java.
  - [Glide](https://github.com/bumptech/glide) O Glide suporta a busca, decodificação e exibição de fotos, imagens e GIFs animados. O Glide inclui uma API flexível que permite que os desenvolvedores se conectem a quase qualquer pilha de rede.
  
- Design de Arquitetura
  - 
  - [MVVM](https://developer.android.com/jetpack/docs/guide) é o padrão de design de arquitetura de software que a Google indica para os novos desenvolvimento. Os novos componentes de arquitetura já são lançados com suporte a esse tipo de padrão.
  
- Padrões de Projeto (Design Patterns)
  - 
  - [Repository](https://proandroiddev.com/the-real-repository-pattern-in-android-efba8662b754) é estratégia para abstrair o acesso aos dados. Ele é composto pelo código em uma aplicação que lida com o armazenamento e a recuperação de dados. [Mais detalhes](https://makingloops.com/why-should-you-use-the-repository-pattern/).
  - [Dependency injection](https://pt.wikipedia.org/wiki/Inje%C3%A7%C3%A3o_de_depend%C3%AAncia) é um padrão de desenvolvimento de programas de computadores utilizado quando é necessário manter baixo o nível de acoplamento entre diferentes módulos de um sistema.
  - [Adapter](https://pt.wikipedia.org/wiki/Adapter) o padrão Adapter converte a interface de uma classe para outra interface que o cliente espera encontrar, "traduzindo" solicitações do formato requerido pelo usuário para o formato compatível com o a classe adapter e as redirecionando. Dessa forma, o Adaptador permite que classes com interfaces incompatíveis trabalhem juntas.
  - [UseCase](https://caminao.blog/how-to-implement-symbolic-representations/patterns/functional-patterns/use-case-patterns/#:~:text=The%20objective%20of%20use%20case,contents%20nor%20preempting%20architectural%20options) o objetivo de um caso de uso é servir o caso de uso de um usuário do sistema. Por exemplo, "acender a luz" ou "enviar e-mail para o locatário".
 
- Princípios do SOLID utilizados
  - 
  - [Single Responsibility](https://en.wikipedia.org/wiki/Single-responsibility_principle) (SRP) principio da Responsabilidade Única.
  - [Interface Segregation](https://www.webcitation.org/6AL2qqIGg?url=http://www.objectmentor.com/resources/articles/isp.pdf) (ISP) princípio da Segregação da Interface.
  - [Dependency Inversion](https://web.archive.org/web/20110714224327/http://www.objectmentor.com/resources/articles/dip.pdf) (DIP) princípio da inversão da dependência.
