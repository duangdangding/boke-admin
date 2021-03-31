package com.lsh.bokeadmin.ctr;

import com.lsh.bokeadmin.service.BokesService;
import com.lsh.bokeadmin.service.CategorysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategorysCtr {
    
    @Autowired
    private CategorysService categorysService;
}
