package com.lsh.bokeadmin.ctr;

import com.lsh.bokeadmin.service.BokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BokesCtr {
    
    @Autowired
    private BokesService bokesService;
}
