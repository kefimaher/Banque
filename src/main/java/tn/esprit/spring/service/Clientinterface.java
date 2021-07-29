package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Client;

public interface Clientinterface {

	
	public Client  saveclient( Client c);
	public Client afficherclient(int idclient);
	public List<Client>afficheallclients();
	public void  deletclient(int idclient);
	public void updateclient(Client c , long idclient);
	
}
