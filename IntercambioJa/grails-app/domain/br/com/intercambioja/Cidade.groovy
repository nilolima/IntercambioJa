package br.com.intercambioja

class Cidade {
	String nome
	static belongsTo = [pais:Pais]
    static constraints = {
    }
}
