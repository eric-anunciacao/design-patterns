package com.em.main;

import com.em.model.Atividade;
import com.em.model.enums.TipoAtividade;
import com.em.service.AcademiaService;

public class AcademiaMain {

	public static void main(String[] args) {
		AcademiaService academia = new AcademiaService();

		Atividade atividade = new Atividade();
		atividade.setTipo(TipoAtividade.CORRIDA);

		academia.exercitar(atividade);
	}
}
