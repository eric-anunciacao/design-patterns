package com.em.academia.strategy.model;

import com.em.academia.model.AtividadeStrategy;

public class Basquete implements EsporteStrategy {

	public void pratica(AtividadeStrategy atividade) {
		atividade.setMinutosPraticados(20);
		atividade.setCaloriasPerdidas(80);
	}
	
	public String nome() {
		return "A classe q ta chamando já deveria saber...........";
	}

}
