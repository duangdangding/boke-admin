package com.lsh.bokeadmin.ctr;

import com.lsh.bokeadmin.service.BokesService;
import com.lsh.bokeadmin.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommontsCtr {
    
    @Autowired
    private CommentsService commentsService;
}
