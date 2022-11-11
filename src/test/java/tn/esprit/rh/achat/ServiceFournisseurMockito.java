package tn.esprit.rh.achat;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.rh.achat.entities.Fournisseur;
import tn.esprit.rh.achat.services.IFournisseurService;



@Slf4j
@SpringBootTest
public class ServiceFournisseurMockito {

	@Autowired
 	IFournisseurService iFournisseurService;
	@Autowired
	IFournisseurService fournisseurService;

	
	
	 @Test
	 public void testAddFournisseur() {
		 
		 Fournisseur f = new Fournisseur(1L,"fournisseur Mock1", "fournisseur",null,null,null,null);
	     List<Fournisseur> fournisseurs = fournisseurService.retrieveAllFournisseurs();
	     int expected=fournisseurs.size();
	     Fournisseur savedFournisseur= fournisseurService.addFournisseur(f);
	     assertEquals(expected+1, fournisseurService.retrieveAllFournisseurs().size());
	     assertNotNull(savedFournisseur.getDetailFournisseur());
	     log.info("Add junit test fournisseur works !!");
	  }
	
// 	@Order(1)
// 	@Test
// 	public void testDeleteFournisseur()
// 	{
// 		iFournisseurService.deleteFournisseur(4L);
// 		assertNull(iFournisseurService.retrieveFournisseur(4L));
// 	}
	
 
 	@Test
 	public void testRetrieveAllFournisseurs()
 	{
 		List<Fournisseur> fournisseurs = iFournisseurService.retrieveAllFournisseurs();
 		assertEquals(4,fournisseurs.size());
 	}
	
// 	@Order(3)
// 	@Test
// 	public void testRetrieveFournisseur()
// 	{
// 		Fournisseur fournisseur = iFournisseurService.retrieveFournisseur(5L);
// 		assertEquals(5L,fournisseur.getIdFournisseur().longValue());
//		
// 	}
	
// 	@Order(4)
// 	@Test
// 	public void testUpdateFournisseur()
// 	{
// 		Fournisseur f = new Fournisseur();
// 		s.setIdFournisseur(1L);
// 		s.setLibelleFournisseur("fournisseur test");
// 		s.setQte(700);
// 		s.setQteMin(7000);
// 		Fournisseur updatedFournisseur=iFournisseurService.updateFournisseur(s);
// 		assertEquals(s.getLibelleFournisseur(),updatedFournisseur.getLibelleFournisseur());
//	}

 }
