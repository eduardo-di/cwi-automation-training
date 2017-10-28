#language: pt
#encoding: iso-8859-1
Funcionalidade: Selenium Teste Exemplo

  @treinamento
  Cenario: Adicionar produto ao carrinho
    Dado que estou na HomePage do site "http://automationpractice.com/index.php"
    E pesquiso pelo produto "Dress"
    Quando clico no botao Add to cart
    Entao deve apresentar a mensagem "Product sucessfully added to your shopping cart"
    

    
   @treinamento1
   Cenario: Enviar mensagem através do menu Contact Us
   		Dado que estou na HomePage do site "http://automationpractice.com/index.php"
   		E clico no link Contact us
			E preencho os campos da tela
   		Quando clico no botao Send
   		#Entao deve apresentar a mensagem "Your message has been successfully sent to our team"