package com.GSPro.API.model;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Siati {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Boolean resolvido;
	private String resolucao;
	private String numeroProcesso;
	private String dataCriaaoProcesso;
	private String tipoProcesso;
	private LocalDate nomeProcesso;
}
