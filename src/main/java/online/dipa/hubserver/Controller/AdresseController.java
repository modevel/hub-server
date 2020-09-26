/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.dipa.hubserver.Controller;

import java.util.ArrayList;
import java.util.List;
import online.dipa.hub_openapi.Adresse;
import online.dipa.hub_openapi.AdresseApi;
import online.dipa.hubserver.Model.MyAdresseDTO;
import online.dipa.hubserver.Service.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
public class AdresseController implements AdresseApi {

    @Autowired
    AdresseService adresseService;

    private MyAdresseDTO map(Adresse adresse) {
        final MyAdresseDTO myAdresseDTO = new MyAdresseDTO();
        myAdresseDTO.setStrasse(adresse.getStrasse());
        myAdresseDTO.setHausnummer(adresse.getHausnummer());
        myAdresseDTO.setPostleitzahl(adresse.getPlz());
        myAdresseDTO.setOrt(adresse.getOrt());
        return myAdresseDTO;
    }

    private Adresse map(MyAdresseDTO adresseDTO) {
        final Adresse adresse = new Adresse();
        adresse.setStrasse(adresseDTO.getStrasse());
        adresse.setHausnummer(adresseDTO.getHausnummer());
        adresse.setPlz(adresseDTO.getPostleitzahl());
        adresse.setOrt(adresseDTO.getOrt());
        return adresse;
    }

    private ArrayList<Adresse> map(ArrayList<MyAdresseDTO> adressenDTO) {
        final ArrayList<Adresse> adressen = new ArrayList<Adresse>();
        adressenDTO.stream().forEach(myAdresseDTO -> adressen.add(map(myAdresseDTO)));
        return adressen;
    }

    @Override
    public ResponseEntity<List<Adresse>> adresseGet() {
        return ResponseEntity.ok(map(adresseService.filterAdresse(new MyAdresseDTO())));
    }

    @Override
    public ResponseEntity<Void> adressePost(Adresse adresse) {
        adresseService.addAdresse(map(adresse));
        return null;
    }

    @Override
    public ResponseEntity<List<Adresse>> adressePut(Adresse adresse) {
        return ResponseEntity.ok(map(adresseService.filterAdresse(map(adresse))));
    }

}
