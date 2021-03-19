package com.em.academia.strategy.model;

import com.em.academia.model.AtividadeStrategy;

public class Corrida implements EsporteStrategy {

	public void pratica(AtividadeStrategy atividade) {
		atividade.setMinutosPraticados(15);
		atividade.setCaloriasPerdidas(150);

	}
	
	public String nome() {
		return "A classe q ta chamando já deveria saber...........";
	}

}
