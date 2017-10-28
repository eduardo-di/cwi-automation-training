package br.com.cwi.automation_training.steps.treinamento;

import br.com.cwi.automation_training.pages.treinamento.TreinamentoPage;
import br.com.cwi.automation_training.util.TestRule;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class treinamentoSteps {
	@Dado("que estou na HomePage do site \"(.*)\"")
		public void homePage (String URL) {
			TestRule.openApplicationChrome(URL);
	}
		
	@E("pesquiso pelo produto \"(.*)\"")
		public void buscaProduto (String nomeDoProduto) {
			TreinamentoPage fazbusca = new TreinamentoPage();
			fazbusca.buscarProduto(nomeDoProduto);		
	}
	
	@Quando("clico no botao Add to cart")
		public void addCarrinho() throws InterruptedException {
			TreinamentoPage treinamentopage = new TreinamentoPage();
			treinamentopage.clicarNoBotaoAddToCart();
	}
	
	
	@Entao("deve apresentar a mensagem \"Product sucessfully added to your shopping cart\"")
		public void exibeMensagem() {
			TreinamentoPage treinamentopage = new TreinamentoPage();
			treinamentopage.verificaMensagem();
}
		
	@E("clico no link Contact us")
		public void clicaBotao() {
			TreinamentoPage treinamentoPage = new TreinamentoPage();
			treinamentoPage.clicarNoBotaoContactUs();
	}
	
	@E("preencho os campos da tela")
		public void preencherReferencia() throws InterruptedException {
			TreinamentoPage treinamentoPage = new TreinamentoPage();
			treinamentoPage.buscaOpcao();		
			treinamentoPage.preencheMail();
			treinamentoPage.preencheReferencia();
			treinamentoPage.insereArquivo();
			treinamentoPage.preencheMensagem();
			Thread.sleep(2000);
	}
	
	@Quando("clico no botao Send")
	public void clicarBotao() {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.clicarNoBotaoSend();
}
	
	@Entao("deve apresentar a mensagem \"Your message has been successfully sent to our team\"")
	public void exibeMensagemContato() {
		TreinamentoPage treinamentopage = new TreinamentoPage();
		treinamentopage.verificaMensagem();

}
