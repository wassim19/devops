//   import static org.junit.Assert.assertEquals;
//   import static org.junit.Assert.assertNotNull;
//   import static org.junit.Assert.assertNull;

//   import java.util.List;

//   import org.junit.jupiter.api.Order;
//   import org.junit.jupiter.api.Test;
//    import org.junit.Test;
//   import org.junit.runner.RunWith;
//   import org.springframework.beans.factory.annotation.Autowired;
//   import org.springframework.boot.test.context.SpringBootTest;
//   import org.springframework.test.context.junit4.SpringRunner;
//   import lombok.extern.slf4j.Slf4j;
//   import tn.esprit.rh.achat.entities.Facture;
//   import tn.esprit.rh.achat.services.IFactureService;

//    @TestMethodOrder(OrderAnnotation.class)
//   @RunWith(SpringRunner.class)
//   @Slf4j
//   @SpringBootTest
//   public class FactureServiceImplTest {

//   	@Autowired
//   	IFactureService iFactureService;
	

//   	@Order(0)
//   	@Test
//   	public void testAddFacture() {

//   		List<Facture> Factures = iFactureService.retrieveAllFactures();
//   		int expected=Factures.size();
//   		Facture s = new Facture();
//   		s.setMontantRemise(11);
//   		s.setMontantFacture(1001);
//   		Facture savedFacture= iFactureService.addFacture(s);
//   		assertEquals(expected+1, iFactureService.retrieveAllFactures().size());
//   		assertNotNull(savedFacture.getMontantRemise());


//   	} 
	
//   	@Order(1)
//   	@Test
//   	public void testDeleteFacture()
//   	{
//   		iFactureService.deleteFacture(4L);
//   		assertNull(iFactureService.retrieveFacture(4L));
//   	}
	
//   	@Order(2)
//   	@Test
//   	public void testRetrieveAllFactures()
//   	{
//   		List<Facture> Factures = iFactureService.retrieveAllFactures();
//   		assertEquals(4,Factures.size());
//   	}
	
//   	@Order(3)
//   	@Test
//   	public void testRetrieveFacture()
//   	{
//   		Facture Facture = iFactureService.retrieveFacture(5L);
//   		assertEquals(5L,Facture.getIdFacture().longValue());
		
//   	}
	
//   	@Order(4)
//   	@Test
//   	public void testUpdateFacture()
//   	{
//   		Facture s = new Facture();
//   		s.setIdFacture(1L);
//   		//s.setLibelleFacture("Facture test");
//   		s.setMontantRemise(700);
//   		s.setMontantFacture(7000); 
//         Facture updatedFacture=iFactureService.updateFacture(s);
//   		assertEquals(s.getMontantRemise(),updatedFacture.getMontantRemise());
//   	}
	
	

//   }