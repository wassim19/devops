package tn.esprit.rh.achat.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FactureDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFacture;
	
	
	/**
	 * 
	 */
	@Temporal(TemporalType.DATE)
	private Date dateCreationFacture;
	private float montantFacture;
	
	@Temporal(TemporalType.DATE)
	private Date dateDerniereModificationFacture;
	@ManyToOne
    @JsonIgnore
    private Fournisseur fournisseur;
	private Boolean archivee;
	@OneToMany(mappedBy = "facture")
	private Set<DetailFacture> detailsFacture;
    private float montantRemise;
    @OneToMany(mappedBy="facture")
    @JsonIgnore
    private Set<Reglement> reglements;
	

	
}
