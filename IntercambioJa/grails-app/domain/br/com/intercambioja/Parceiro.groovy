package br.com.intercambioja

class Parceiro {
	
	static constraints = {
		nomeDaEmpresa()
		nomeDoContato()
		endereco()
		cidade()
		cep()
		pais()
		telefone()
		email()
		webSite()
		
	}

	String nomeDaEmpresa
	String nomeDoContato
	String endereco
	String cidade
	String cep
	String pais
	String telefone
	String email
	String webSite
	Date dateCreated
	Date lastUpdated

	
}
