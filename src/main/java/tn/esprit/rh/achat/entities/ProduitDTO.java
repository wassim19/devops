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
public class ProduitDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduit;
	
	
	
	/**
	 * 
	 */
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	private float prix;
	private String libelleProduit;
	@ManyToOne
	@JsonIgnore
	private Stock stock;
	@Temporal(TemporalType.DATE)
	private Date dateDerniereModification;
	private String codeProduit;	
	@ManyToOne
	@JsonIgnore
	private CategorieProduit categorieProduit;
	@OneToMany(mappedBy = "produit")
	@JsonIgnore
	private Set<DetailFacture> detailFacture;
	
	


	

}
