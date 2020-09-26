/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.dipa.hubserver.Model;

import lombok.Data;

/**
 *
 * @author user
 */
@Data
public class MyAdresseDTO {
    public String strasse;
    public String hausnummer;
    public String hausnummerZusatz;
    public String postleitzahl;
    public String ort;
}
