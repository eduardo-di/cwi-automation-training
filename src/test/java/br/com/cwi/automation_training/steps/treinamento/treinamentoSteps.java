package br.com.cwi.automation_training.steps.treinamento;

import br.com.cwi.automation_training.pages.treinamento.TreinamentoPage;
import br.com.cwi.automation_training.util.TestRule;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;


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
}
