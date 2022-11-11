// package com.esprit.examen.services;

// import com.esprit.examen.entities.SecteurActivite;
// import com.esprit.examen.repositories.SecteurActiviteRepository;
// import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.Mockito;
// import org.mockito.junit.jupiter.MockitoExtension;
// import org.springframework.boot.test.context.SpringBootTest;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Optional;

// @SpringBootTest
// @ExtendWith(MockitoExtension.class)
// class SecteurActiviteImplTest {
//     @Mock
//     SecteurActiviteRepository Repo;

//     @InjectMocks
//     SecteurActiviteServiceImpl Service;

//     SecteurActivite secteurActivite = SecteurActivite.builder().codeSecteurActivite("secteur").libelleSecteurActivite("lib").build();
//     List<SecteurActivite> listSecteurActivites = new ArrayList<SecteurActivite>() {
//         {
//             add(SecteurActivite.builder().codeSecteurActivite("secteur1").libelleSecteurActivite("lib1").build());
//             add(SecteurActivite.builder().codeSecteurActivite("secteur2").libelleSecteurActivite("lib2").build());
//         }
//     };

 

//     @Test
//     void testAllRetrievesecteurActivite() {
//         Mockito.when(Repo.findAll()).thenReturn(listSecteurActivites);
//         List<SecteurActivite> lSecteurActivite = Service.retrieveAllSecteurActivite();
//         Assertions.assertNotNull(lSecteurActivite);
//     }

   



// }