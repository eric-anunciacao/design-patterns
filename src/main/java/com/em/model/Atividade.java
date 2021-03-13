package com.em.model;

import com.em.model.enums.TipoAtividade;

public class Atividade {

	private TipoAtividade tipo;
	private int minutosPraticados;
	private int caloriasPerdidas;

	public TipoAtividade getTipo() {
		return tipo;
	}

	public void setTipo(TipoAtividade tipo) {
		this.tipo = tipo;
	}

	public int getMinutosPraticados() {
		return minutosPraticados;
	}

	public void setMinutosPraticados(int minutosPraticados) {
		this.minutosPraticados = minutosPraticados;
	}

	public int getCaloriasPerdidas() {
		return caloriasPerdidas;
	}

	public void setCaloriasPerdidas(int caloriasPerdidas) {
		this.caloriasPerdidas = caloriasPerdidas;
	}

}
