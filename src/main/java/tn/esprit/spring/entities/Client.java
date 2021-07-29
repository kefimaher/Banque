package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Client implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne(mappedBy="client")
	private Credit credit;
	@OneToMany(mappedBy="client")
	private Set<Compte> comptes;
	@OneToMany(mappedBy="client")
	private Set<Facture> factures;
	@ManyToMany
	private Set<Intervention> interventions;
	@ManyToOne
	private Admin admin;
	
	private Type typeClient;
	private String nom_client;
	private String prenom_client;
	private int cin;
	private int telephone;
	private String isactive ;
	private String statut ;
	private String login ;
	private String password ;

	
	
	
	
	public Client(long id, Credit credit, Set<Compte> comptes, Set<Facture> factures, Set<Intervention> interventions,
			Admin admin, Type typeClient, String nom_client, String prenom_client, int cin, int telephone,
			String isactive, String statut, String login, String password) {
		super();
		this.id = id;
		this.credit = credit;
		this.comptes = comptes;
		this.factures = factures;
		this.interventions = interventions;
		this.admin = admin;
		this.typeClient = typeClient;
		this.nom_client = nom_client;
		this.prenom_client = prenom_client;
		this.cin = cin;
		this.telephone = telephone;
		this.isactive = isactive;
		this.statut = statut;
		this.login = login;
		this.password = password;
	}





	public Client() {
		super();
	}

	
	
	

	public Credit getCredit() {
		return credit;
	}
	public void setCredit(Credit credit) {
		this.credit = credit;
	}
	public Set<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}
	public Set<Facture> getFactures() {
		return factures;
	}
	public void setFactures(Set<Facture> factures) {
		this.factures = factures;
	}
	public Set<Intervention> getInterventions() {
		return interventions;
	}
	public void setInterventions(Set<Intervention> interventions) {
		this.interventions = interventions;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public Type getTypeClient() {
		return typeClient;
	}
	public void setTypeClient(Type typeClient) {
		this.typeClient = typeClient;
	}
	public String getNom_client() {
		return nom_client;
	}
	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}
	public String getPrenom_client() {
		return prenom_client;
	}
	public void setPrenom_client(String prenom_client) {
		this.prenom_client = prenom_client;
	}

	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getStatut() {
		return statut;
	}


	public void setStatut(String statut) {
		this.statut = statut;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Client [id=" + id + ", credit=" + credit + ", comptes=" + comptes + ", factures=" + factures
				+ ", interventions=" + interventions + ", admin=" + admin + ", typeClient=" + typeClient
				+ ", nom_client=" + nom_client + ", prenom_client=" + prenom_client + ", cin=" + cin + ", telephone="
				+ telephone + ", isactive=" + isactive + "]";
	}
	
	
	
	
}
