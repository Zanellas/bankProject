package br.com.bank.keeper;

import br.com.bank.model.Account;

public class KeeperOfAccounts {

	private Account[] references;
	private int freePosition;
	
	public KeeperOfAccounts() {
		this.references = new Account[10];
		this.freePosition = 0;
	}

	public void add(Account account) {
		this.references[this.freePosition] = account;
		this.freePosition++;
	}

	public int getNumberOfElements() {
		return this.freePosition;
	}

	public Object getReference(int i) {
		return this.references[i];
	}
}
