package com.GSPro.API.model;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Pessoa {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String nome;
	 private String foneMovel;
	 private String foneFixo;
	 private String email;
	 private LocalDate dataNascimento;
	 

}
