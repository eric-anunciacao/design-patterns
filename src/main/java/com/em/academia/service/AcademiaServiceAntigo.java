package com.em.academia.service;

import java.util.logging.Logger;

import com.em.academia.model.Atividade;
import com.em.model.academia.enums.TipoAtividadeAntigo;

public class AcademiaServiceAntigo {

	private static final Logger LOGGER = Logger.getLogger(AcademiaServiceAntigo.class.getName());

	public void exercitar(Atividade atividade) {
		if (TipoAtividadeAntigo.CORRIDA.equals(atividade.getTipo())) {
			atividade.setMinutosPraticados(15);
			atividade.setCaloriasPerdidas(150);
		} else if (TipoAtividadeAntigo.NATACAO.equals(atividade.getTipo())) {
			atividade.setMinutosPraticados(45);
			atividade.setCaloriasPerdidas(100);
		} else if (TipoAtividadeAntigo.FUTEBOL.equals(atividade.getTipo())) {
			atividade.setMinutosPraticados(90);
			atividade.setCaloriasPerdidas(200);
		} else if (TipoAtividadeAntigo.BASQUETE.equals(atividade.getTipo())) {
			atividade.setMinutosPraticados(20);
			atividade.setCaloriasPerdidas(80);
		} else if (TipoAtividadeAntigo.VOLEI.equals(atividade.getTipo())) {
			atividade.setMinutosPraticados(40);
			atividade.setCaloriasPerdidas(110);
		}

		LOGGER.info("Resumo da atividade: " + atividade.getTipo());
		LOGGER.info("Minutos praticados: " + atividade.getMinutosPraticados());
		LOGGER.info("Calorias perdidas: " + atividade.getCaloriasPerdidas());
	}
}
