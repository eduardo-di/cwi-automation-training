package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.cwi.automation_training.pages.BasePage;


public class TreinamentoElementMap extends BasePage {

	protected WebElement search_query_top;
	
	@FindBy(css = ".button-search")
	protected WebElement botaoPesquisar;
	
	@FindBy (xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]")
	protected WebElement apareceBotao;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
	protected WebElement btnAddToCart;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/i")
	protected WebElement exibeMensagem;
	
	@FindBy(xpath = "//*[@id=\"contact-link\"]/a")
	protected WebElement btnContactUs;	
	
	@FindBy(xpath = "//*[@id=\"id_order\"]")
	protected WebElement campoOrder;

	@FindBy(xpath = "//*[@id=\"email\"]")
	protected WebElement campoMail;
	
	@FindBy(xpath = "//*[@id=\"message\"]")
	protected WebElement campoMensagem;

	@FindBy (xpath = "//*[@id=\"fileUpload\"]")	
	protected WebElement mandaArquivo;
	
	@FindBy (xpath = "//*[@id=\"id_contact\"]")
	protected WebElement buscaOpcao;
	
	@FindBy(xpath = "//*[@id=\"submitMessage\"]")
	protected WebElement btnContactSend;	
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/i")
	protected WebElement exibeMensagemContato;
}
	