package com.aws.docker.awsdocker.controller;

import com.aws.docker.awsdocker.model.Location;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {
    @GetMapping("/locations")
    public ResponseEntity<List> getLocations() {

        Location location1 = new Location();
        location1.setLat(2.2);
        location1.setLon(3.2);
        location1.setLocAddress("Morgan Stanley");
        location1.setLocName("Bangalore");
        Location location2 = new Location();
        location2.setLat(2.2);
        location2.setLon(3.2);
        location2.setLocAddress("RBS");
        location2.setLocName("Delhi");
        List<Location> list = new ArrayList<>();
        list.add(location1);
        list.add(location2);
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
