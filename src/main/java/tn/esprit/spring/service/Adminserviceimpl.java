package tn.esprit.spring.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import tn.esprit.spring.entities.Admin;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.repository.AdminRepositoy;
import tn.esprit.spring.repository.ClientRepository;



@Service
public class Adminserviceimpl {
	
	
	@Autowired 
	AdminRepositoy  adminrepostory;	
	 Clientserviceimpl clientserviceimpl ;
	ClientRepository clientRepository  ;
	
	public Admin  saveadmin( Admin a) 
	{
	   return adminrepostory.save(a);	
	}
	
public Admin afficheradmin(int idadmin){
		
		return adminrepostory.findById((long) idadmin).orElse(null);
		
	}
	
	public List<Admin>affichealladmins() {
		
		return (List<Admin>) adminrepostory.findAll();
		
	}
	
	public void deletadmin(long id){
		 adminrepostory.deleteById(id);
		
	}
		
	public void updateadmin(Admin admin,  long idadmin){

		admin.setId(idadmin);
		adminrepostory.save(admin);
	
	}
	
	
 public void affecteradmincleint(long idadmin ,Client client)
 {
	  Admin a = adminrepostory.findById(idadmin).get();	
	 client.setAdmin(a);
	 System.out.println(client.toString());
	// clientserviceimpl.saveclient(client);
	//  clientRepository.save(client);
	
 }
	
	@Query("select admin from Admin e where e.user_name=:x")
	public boolean login(@Param("x") String username) {
				
		
		return true ;


	}
	
	
	
}
	

