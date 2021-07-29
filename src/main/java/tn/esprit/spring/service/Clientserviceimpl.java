package tn.esprit.spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.repository.AdminRepositoy;
import tn.esprit.spring.repository.ClientRepository;

@Service
public class Clientserviceimpl {

	
	@Autowired 
	ClientRepository  client;
	AdminRepositoy  adminrepostory;	
	
		public Client  saveclient(Client c) 
		{
			return  client.save(c);
		}
	

public Client afficherclient(int idclient){
		
		return client.findById((long) idclient).orElse(null);
		
	}
	
	public List<Client>afficheallclients() {
		
		return (List<Client>) client.findAll();
	}
	
	public void deletclient(int idclient)
	{
		client.deleteById((long) idclient);
		
	}
public void updateclient(Client c , long idclient){
		c.setId(idclient);
     	client.save(c);
	}


}
