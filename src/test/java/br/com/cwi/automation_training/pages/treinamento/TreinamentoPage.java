package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import br.com.cwi.automation_training.util.TestRule;

public class TreinamentoPage extends TreinamentoElementMap{
	
	public TreinamentoPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}	

	public void buscarProduto(String produto) {	
		search_query_top.sendKeys(produto);
		botaoPesquisar.click();
		logPrint("Buscou pelo produto " + produto);
	}
	
	public void clicarNoBotaoAddToCart() throws InterruptedException{
		Thread.sleep(5000);
		moveToElement(apareceBotao);
		btnAddToCart.click();		
		
	}
	
	
	public void buscaOpcao() {
		new Select(buscaOpcao).selectByVisibleText("Customer service");
	}
	
	public boolean verificaMensagem() {
		logPrint("Validação de Mensagem");
		return exibeMensagem.getText().equals("Product sucessfully added to your shopping cart");
	}
			
	public void clicarNoBotaoContactUs() {
		btnContactUs.click();
	}
		
	public void preencheReferencia() {
		campoOrder.sendKeys("Hello Word");
	}
	
	
	public void preencheMail() {
		campoMail.sendKeys("joao@terra.com.br");
	}
	
	public void insereArquivo() {
		mandaArquivo.sendKeys("C:\\Users\\automacao\\Desktop\\treinamento-automação de testes-cwi.txt");
	}
	
	public void preencheMensagem() {
		campoMensagem.sendKeys("Hello World");
	}
		
	public void clicarNoBotaoSend() {
		btnContactSend.click();
	}
	
	public boolean verificaMensagemContato() {
		logPrint("Validação de Mensagem");
		return exibeMensagemContato.getText().equals("Your message has been successfully sent to our team");
	}
}