package tn.esprit.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Admin;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.repository.AdminRepositoy;
import tn.esprit.spring.service.Clientserviceimpl;


@RestController
public class ClientController {
	@Autowired
	Clientserviceimpl client ;
	AdminRepositoy  adminrepostory;	
	@PostMapping("/saveclient")
	
	public void ajouterClient(@RequestBody Client c) {
	 client.saveclient(c);
	}
	 @GetMapping("/afficherclient/{idclient}")
		public Client afficherclient(@PathVariable int idclient) {
			return client.afficherclient(idclient);
		}
	 @GetMapping("/allclient")
		public List<Client>afficheallclients() {
			return client.afficheallclients();
		} 
	 @GetMapping("/deletclient/{idclient}")
		public void deletclient(@PathVariable int idclient) {
			 client.deletclient(idclient);
		}
	 @PutMapping("/updateclient/{idclient}")
		public void updateadmin( @RequestBody Client c ,  @PathVariable long idclient ) {
			client.updateclient(c,idclient);
		}
	 
	 
}
