package com.GSPro.API.model;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Cliente extends Pessoa{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Siati siati;
}
