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
import tn.esprit.spring.service.Adminserviceimpl;

@RestController
public class AdminController {

	@Autowired
	Adminserviceimpl admin;
	 @PostMapping("/saveadmin")
	 
	public void ajouteradmin( @RequestBody Admin a) {
		admin.saveadmin(a);
	}
	 @GetMapping("/afficheadmin/{idadmin}")
		public Admin afficheradmin(@PathVariable int idadmin) {
			return admin.afficheradmin(idadmin);
		}
	 @GetMapping("/alladmins")
		public List<Admin>affichealladmins() {
			return admin.affichealladmins();
		} 
	 @GetMapping("/deletadmin/{idadmin}")
	
		public void deletadmin( @PathVariable int idadmin) {
			admin.deletadmin(idadmin);
		}
	 @PutMapping("/updateadmin/{idadmin}")
		public void updateadmin( @RequestBody Admin a ,  @PathVariable long idadmin ) {
			admin.updateadmin(a,idadmin);
		}
	 @GetMapping("/affecteradmincleint/{idadmin}")
		public void updateadmin(  @PathVariable int idadmin, @RequestBody Client client) {
			admin.affecteradmincleint(idadmin, client);
		}
	 
		 
}
