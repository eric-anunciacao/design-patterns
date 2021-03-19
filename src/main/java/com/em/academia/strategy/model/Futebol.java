package com.em.academia.strategy.model;

import com.em.academia.model.AtividadeStrategy;

public class Futebol implements EsporteStrategy {

	public void pratica(AtividadeStrategy atividade) {
		atividade.setMinutosPraticados(90);
		atividade.setCaloriasPerdidas(200);

	}

	public String nome() {
		return "A classe q ta chamando já deveria saber...........";
	}

}
