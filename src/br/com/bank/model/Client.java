package br.com.bank.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Client implements Serializable {

	private String name;
	private String cpf;
	private String profession;
	private String contactNumber;
	private String email;
	private Adress adress;
	private LocalDate date;

	
	public Client(String name, String cpf, String profession, String contactNumber, String email, Adress adress,
			LocalDate date) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.profession = profession;
		this.contactNumber = contactNumber;
		this.email = email;
		this.adress = adress;
		this.date = date;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profession;
	}

	public void setProfissao(String profissao) {
		this.profession = profissao;
	}
	
	
	

}
