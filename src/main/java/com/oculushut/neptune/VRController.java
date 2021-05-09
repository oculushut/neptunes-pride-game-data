package com.oculushut.neptune;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("vr")
public class VRController {
    @Autowired
    private VRService VRService;

    @GetMapping(value="/data", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getData(){
        //return data from VR Neptune's Pride API
        String data = VRService.getData();
        return data;
    }
}