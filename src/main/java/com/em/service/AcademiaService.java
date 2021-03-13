package com.em.service;

import java.util.logging.Logger;

import com.em.model.Atividade;
import com.em.model.enums.TipoAtividade;

public class AcademiaService {

	private static final Logger LOGGER = Logger.getLogger(AcademiaService.class.getName());

	public void exercitar(Atividade atividade) {
		if (TipoAtividade.CORRIDA.equals(atividade.getTipo())) {
			atividade.setMinutosPraticados(15);
			atividade.setCaloriasPerdidas(150);
		} else if (TipoAtividade.NATACAO.equals(atividade.getTipo())) {
			atividade.setMinutosPraticados(45);
			atividade.setCaloriasPerdidas(100);
		} else if (TipoAtividade.FUTEBOL.equals(atividade.getTipo())) {
			atividade.setMinutosPraticados(90);
			atividade.setCaloriasPerdidas(200);
		} else if (TipoAtividade.BASQUETE.equals(atividade.getTipo())) {
			atividade.setMinutosPraticados(20);
			atividade.setCaloriasPerdidas(80);
		} else if (TipoAtividade.VOLEI.equals(atividade.getTipo())) {
			atividade.setMinutosPraticados(40);
			atividade.setCaloriasPerdidas(110);
		}

		LOGGER.info("Resumo da atividade: " + atividade.getTipo());
		LOGGER.info("Minutos praticados: " + atividade.getMinutosPraticados());
		LOGGER.info("Calorias perdidas: " + atividade.getCaloriasPerdidas());
	}
}
