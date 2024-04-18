#language:pt
@tag
Funcionalidade: Abertura de conta

  @tag1
  Cenario: Validar formulario de abertura de conta com sucesso
    Dado que o usuario acesse a url "https://nubank.com.br/"
    Quando digitar o cpf valido
    E Selecionar o botao continuar
    E preencher o formulario
    E selecionar o botao enviar
    Entao realizo a validação com sucesso
    
 
