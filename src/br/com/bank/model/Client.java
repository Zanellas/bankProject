package br.com.bank.model;

import java.time.LocalDate;

public class Client {

	private String name;
	private String cpf;
	private String contactNumber;
	private String email;	
	private LocalDate date;
	private Adress adress;

	
	public Client(String name, String cpf, String contactNumber, String email, Adress adress, LocalDate date) {
		this.name = name;
		this.cpf = cpf;
		this.contactNumber = contactNumber;
		this.email = email;		
		this.date = date;
		this.adress = adress;
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

}
