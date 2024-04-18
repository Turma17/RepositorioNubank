package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class Steps {
	
Elementos e = new Elementos();
Metodos m = new Metodos();	

@Dado("que o usuario acesse a url {string}")
public void que_o_usuario_acesse_a_url(String urldafeature) {
	m.abrirNavegador(urldafeature); 
}

@Quando("digitar o cpf valido")
public void digitar_o_cpf_valido() throws InterruptedException {
 m.pausa(5000);
 m.preencher(e.getCampoCpF(), "");
}

@Quando("Selecionar o botao continuar")
public void selecionar_o_botao_continuar() {
}

@Quando("preencher o formulario")
public void preencher_o_formulario() {
    
}

@Quando("selecionar o botao enviar")
public void selecionar_o_botao_enviar() {
    
}

@Entao("realizo a validação com sucesso")
public void realizo_a_validação_com_sucesso() {
	
}
  
}
