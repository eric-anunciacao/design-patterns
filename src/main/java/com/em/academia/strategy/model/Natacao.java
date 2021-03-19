package com.em.academia.strategy.model;

import com.em.academia.model.AtividadeStrategy;

public class Natacao implements EsporteStrategy {

	public void pratica(AtividadeStrategy atividade) {
		atividade.setMinutosPraticados(45);
		atividade.setCaloriasPerdidas(100);

	}
	
	public String nome() {
		return "A classe q ta chamando já deveria saber...........";
	}

}
