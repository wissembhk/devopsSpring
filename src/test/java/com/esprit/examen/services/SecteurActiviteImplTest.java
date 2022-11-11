package com.esprit.examen.services;

import com.esprit.examen.entities.SecteurActivite;
import com.esprit.examen.repositories.SecteurActiviteRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class SecteurActivite {
    @Mock
    SecteurActiviteRepository Repo;

    @InjectMocks
    SecteurActiviteServiceImpl Service;

    SecteurActivite secteurActivite = SecteurActivite.builder().idSecteurActivite(1).qte(100).codeSecteurActivite("11F").libelleSecteurActivite("aa").build();
    List<Stock> listStocks = new ArrayList<Stock>() {
        {
            add(SecteurActivite.builder().idSecteurActivite(12).qte(1000).codeSecteurActivite("111F").libelleSecteurActivite("bb").build());
            add(SecteurActivite.builder().idSecteurActivite(12).qte(1000).codeSecteurActivite("1111F").libelleSecteurActivite("cc").build());
        }
    };

    @Test
    void testRetrieveSecteurActivite() {
        Mockito.when(Repo.findById(Mockito.anyLong())).thenReturn(Optional.of(SecteurActivite));
        @SuppressWarnings("removal")
        SecteurActivite s1 = Service.retrieveSecteurActivite(new Long(2));
        Assertions.assertNotNull(s1);
    }

    @Test
    void testAllRetrieveSecteurActivite() {
        Mockito.when(Repo.findAll()).thenReturn(SecteurActivite);
        List<SecteurActivite> lSecteurActivite = Service.retrieveAllSecteurActivites();
        Assertions.assertNotNull(lSecteurActivite);
    }

    @Test
    void testAddstock() {
        Mockito.when(Repo.save(SecteurActivite)).thenReturn(SecteurActivite);
        SecteurActivite s1 = Service.addSecteurActivite(SecteurActivite);
        Assertions.assertNotNull(s1);

    }

   

   


}