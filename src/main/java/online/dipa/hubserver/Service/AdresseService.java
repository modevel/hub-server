/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.dipa.hubserver.Service;

import java.util.ArrayList;
import online.dipa.hubserver.Model.MyAdresseDTO;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class AdresseService { // implements AdresseServiceInterface

    public MyAdresseDTO addAdresse(final MyAdresseDTO adresse) {
        // Validierung besser hier.
        return adresse;
    }

    public ArrayList<MyAdresseDTO> filterAdresse(final MyAdresseDTO adresse) {
        // Validierung besser hier.
        final ArrayList<MyAdresseDTO> list = new ArrayList<MyAdresseDTO>();
        list.add(adresse);
        list.add(adresse);
        list.add(adresse);
        list.add(adresse);
        list.add(adresse);
        return list;
    }

}
