Módulo 1 - Criando o projeto:

* Criação de um projeto Spring através do https://start.spring.io/
* Carregando as dependências do projeto usando o Maven
* Criar uma classe Controller com as anotações @RestController @RequestMapping e @GetMapping
* Rodar o projeto no navegador através do endereço http://localhost:8080

Módulo 2 - Requisições POST:
* Criação de uma collection que conterá os dados da nossa requisição (desenvolvimento realizado no Insomnia)
* Utilização do método DTO (criação de Record para delimitar dados vindos da requisição)
* DTO (Data Transfer Object), via Java Records, para representar os dados recebidos de uma requisição POST
* Criação do POST - /medicos
* Criação do POST - /paciente

Collections de utilização:

Para Cadastro de Médicos:

{
"nome" : "Ruan Toyoshima",
"email" : "email@example.com.br",
"crm" : "789456",
"especialidade" : "DERMATOLOGIA",
"endereco" : {
"logradouro" : "Rua da Medicina",
"bairro" : "Campo limpo",
"cep" : "05678-897",
"cidade" : "Medic City",
"uf" : "MC",
"numero" : "",
"complemento" : ""
}
}

Para Cadastro de pacientes:

{
"nome" : "Leon Scoth Kennedy",
"email" : "email.paciente@example.com.br",
"telefone" : "(21) 4002-8922",
"cpf" : "707070707070",
"endereco" : {
"logradouro" : "Rua do Cliente",
"bairro" : "Bairro tanque",
"cep" : "7850-5623",
"cidade" : "Cidade Maravilhosa",
"uf" : "CM",
"numero" : "9875",
"complemento" : "3"
}
}

* Lembrando que os dados número e complemento dos dois cadastros não são obrigatórios, podendo retornar null;

* https://www.json.org/json-pt.html
* https://docs.oracle.com/en/java/javase/16/language/records.html
* https://trello.com/b/O0lGCsKb/api-voll-med
* https://www.figma.com/file/N4CgpJqsg7gjbKuDmra3EV/Voll.med

Status conhecidos:

* 404 - Acontecerá se o endereço da requisição for inválido
* 200 - Retornará o "OK", significa que ocorreu tudo bem com a requisição

