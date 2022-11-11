//package tn.esprit.rh.achat;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.mockito.Mockito.when;
//
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import lombok.extern.slf4j.Slf4j;
//import tn.esprit.rh.achat.entities.Fournisseur;
//import tn.esprit.rh.achat.entities.Stock;
//import tn.esprit.rh.achat.repositories.FournisseurRepository;
//import tn.esprit.rh.achat.repositories.StockRepository;
//import tn.esprit.rh.achat.services.FournisseurServiceImpl;
//import tn.esprit.rh.achat.services.IFournisseurService;
//import tn.esprit.rh.achat.services.IStockService;
//import tn.esprit.rh.achat.services.StockServiceImpl;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//@SpringBootTest
//@Slf4j
//public class ServiceFournisseurTest {
//
//	
//  @MockBean
//  FournisseurRepository fournisseurRepository;
//  @InjectMocks
//  FournisseurServiceImpl fournisseurServiceImpl;
//  @Autowired
//  IFournisseurService fournisseurService;
//
// Fournisseur f = new Fournisseur();
// private Fournisseur fournisseur1 = new Fournisseur(1L,"fournisseur Mock1", "fournisseur",null,null,null,null);
// private Fournisseur fournisseur2 = new Fournisseur(1L,"fournisseur Mock2", "fournisseur",null,null,null,null);
//  
//
//  
//  @Test
//public void retrieveAllFournisseurTestM() {
//    when(fournisseurRepository.findAll()).thenReturn(Stream.of(fournisseur1,fournisseur2).collect(Collectors.toList()));
//    assertEquals(2,fournisseurService.retrieveAllFournisseurs().size());
//    log.info("Retrieve stocks works !");
//}
//}
