package ola;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Pereba {
	private String primeiroNome;
	private String Sobrenome;
	
	// criar um construtor sem argumentos
	public Pereba() {
		
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	

	

}

