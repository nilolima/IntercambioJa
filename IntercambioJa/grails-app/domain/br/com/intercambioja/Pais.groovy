package br.com.intercambioja

class Pais {
	String nome
	static has_many = [cidades:Cidade]
    static constraints = {
    }
}
