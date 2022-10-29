package tn.esprit.rh.achat;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

import tn.esprit.rh.achat.entities.Operateur;
import tn.esprit.rh.achat.repositories.OperateurRepository;
import tn.esprit.rh.achat.services.IOperateurService;



@SpringBootTest
public class OperateurServiceImplTest {
	
	@InjectMocks	
	IOperateurService operateurService;
	
	@Mock
	OperateurRepository operateurRepository;
	
	@Test
	@Order(0)
	public void testAddOperateur() {
		
		List<Operateur> ops = operateurService.retrieveAllOperateurs();
		int expected=ops.size();
		Operateur o = new Operateur();
		o.setNom("test");
		o.setPrenom("tesssssst");
		o.setPassword("123456");
		o.setFactures(null);
	    Operateur savedOp= operateurService.addOperateur(o);
		assertEquals(expected+1, operateurService.retrieveAllOperateurs().size());
		assertNotNull(savedOp.getIdOperateur());
		operateurService.deleteOperateur(savedOp.getIdOperateur());
		}

	Operateur o = Operateur.builder().nom("mock1").prenom("mockitou").password("passmock").factures(null).build();
	
	
	@Test 
	public void saveOperateurTest() {
		when(operateurRepository.findAll()).thenReturn(Stream
				.of(new Operateur((long)12,"mock","mocks","123000",null),new Operateur((long)15,"mock1","mocks1","123001",null)).collect(Collectors.toList()));
				
	}

	@Test
	public void deleteOperateurTest() {
		Operateur operateur = new Operateur((long)12,"mock","mocks","123000",null);
		operateurService.deleteOperateur(operateur.getIdOperateur());
		verify(operateurRepository, times(1)).delete(operateur);
	}	






}
