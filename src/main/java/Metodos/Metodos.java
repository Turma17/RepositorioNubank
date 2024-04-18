package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
WebDriver driver;{
}

public void clicar(By elemento) {
	driver.findElement(elemento).click();
	
}
public void preencher(By elemento, String texto) {
	driver.findElement(elemento).sendKeys(texto);		
		}
		
public void pausa(int tempo) throws InterruptedException {
	Thread.sleep(tempo);
	}

public void validartexto(By elemento, String textoEsperado){
	String texto = driver.findElement(elemento).getText();
	System.out.println(texto);
	
}
public void abrirNavegador() {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("url");
}
	
}

	
		1111111111111111
	