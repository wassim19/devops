//  import org.junit.jupiter.api.Test;
//  import org.junit.runner.RunWith;
//  import org.mockito.InjectMocks;
//  import org.springframework.beans.factory.annotation.Autowired;
//  import org.springframework.boot.test.context.SpringBootTest;
//  import org.springframework.boot.test.mock.mockito.MockBean;
//  import org.springframework.core.annotation.Order;
//  import org.springframework.test.context.junit4.SpringRunner;

//  import lombok.extern.slf4j.Slf4j;
//  import tn.esprit.rh.achat.entities.Facture;
//  import tn.esprit.rh.achat.repositories.FactureRepository;
//  import tn.esprit.rh.achat.services.IFactureService;
//  import tn.esprit.rh.achat.services.FactureServiceImpl;

//  import static org.junit.Assert.assertEquals;
//  import static org.junit.Assert.assertNotNull;
//  import static org.mockito.Mockito.times;
//  import static org.mockito.Mockito.verify;
//  import static org.mockito.Mockito.when;

//  import java.util.Optional;
//  import java.util.stream.Collectors;
//  import java.util.stream.Stream;

//  @RunWith(SpringRunner.class)
//  @SpringBootTest
//  @Slf4j
//  @Order(0)
//  public class FactureServiceTest {
//      @MockBean
//      FactureRepository FactureRepository;
//      @InjectMocks
//      FactureServiceImpl FactureServiceImpl;
//      @Autowired
//      IFactureService FactureService;

//       Facture s = new Facture(100,10000);
//      private Facture Facture1 = new Facture(1L, 1000, 10000,null);
//      private Facture Facture2 = new Facture(2L, 200, 2000,null);
//       @Test
//       public void testAddFacture() {
//           List<Facture> Factures = FactureService.retrieveAllFactures();
//           int expected=Factures.size();
//           Facture savedFacture= FactureService.addFacture(s);
//           assertEquals(expected+1, FactureService.retrieveAllFactures().size());
//           assertNotNull(savedFacture.getLibelleFacture());
//           log.info("Add junit test Facture works !!");
//       }
   
//      @Test
//      public void addFactureTestM() {
//          when(FactureRepository.save(Facture1)).thenReturn(Facture1);
//          assertNotNull(Facture1);
//          assertEquals(Facture1, FactureService.addFacture(Facture1));
//          log.info("add works !!");
//      }
//      @Test
//      public void retrieveAllFacturesTestM() {
//          when(FactureRepository.findAll()).thenReturn(Stream
//                  .of(Facture1,Facture2)
//                  .collect(Collectors.toList()));
//          assertEquals(2,FactureService.retrieveAllFactures().size());
//          log.info("Retrieve Factures works !");
//      }
//      @Test
//      public void DeleteFactureTestM() {
//          FactureRepository.save(Facture1);
//          FactureService.deleteFacture(Facture1.getIdFacture());
//          verify(FactureRepository, times(1)).deleteById(Facture1.getIdFacture());
//          log.info("Delete works !");
//      }
//      @Test
//      public void UpdateFactureTestM() {
//          when(FactureRepository.save(Facture1)).thenReturn(Facture1);
//          assertNotNull(Facture1);
//          assertEquals(Facture1, FactureService.updateFacture(Facture1));
//          log.info("Update works !!");
//      }
//      @Test
//      public void retrieveFactureTestM() {
//          when(FactureRepository.findById(Facture1.getIdFacture())).thenReturn(Optional.of(Facture1));
//          assertEquals(Facture1, FactureService.retrieveFacture(Facture1.getIdFacture()));
//          log.info("Retrieve works !!");
//      }
//  }