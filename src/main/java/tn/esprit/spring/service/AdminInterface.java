package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Admin;
import tn.esprit.spring.entities.Client;
public interface AdminInterface {

	
	public void saveadmin(Admin a) ;
	public Admin afficheradmin(int idadmin);
	public List<Admin>affichealladmins();
	public void deletadmin(long id);
	public void updateadmin(Admin admin,  long idadmin);
	public void affecteradmincleint(long idadmin ,Client client);
}
