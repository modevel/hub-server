/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.dipa.hubserver.Controller;

import online.dipa.hub_openapi.StatusApi;
import online.dipa.hub_openapi.Status;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
public class StatusController implements StatusApi {

    @CrossOrigin
    public ResponseEntity<Status> statusGet() {
        return new ResponseEntity<Status>(new Status(), HttpStatus.OK);
    }
}
