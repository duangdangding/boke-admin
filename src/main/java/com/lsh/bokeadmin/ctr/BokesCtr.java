package com.lsh.bokeadmin.ctr;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lsh.bokeadmin.entry.*;
import com.lsh.bokeadmin.service.BokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BokesCtr {
    
    @Autowired
    private BokesService bokesService;
    
    @RequestMapping("/selectBokes")
    public BootStrapResult<BokeListEntry> getBokes(Integer pageNumber, Integer pageSize,Bokes bokes) {
        IPage<BokeListEntry> bokes1 = bokesService.getBokes(pageNumber, pageSize, bokes);
        return new BootStrapResult<>(bokes1.getRecords(),bokes1.getTotal());
    }
    
    @PostMapping("/addBoke")
    public ResultDto<String> addBoke(Bokes bokes) {
        boolean b = bokesService.saveOrUpdate(bokes);
        String res = "";
        if (b) {
            res = "操作成功~";
        } else {
            res = "操作失败~";
        }
        return ResultDtoManager.success(res);
    }
    
    @RequestMapping("/getBoke/{bokeId}")
    public ResultDto<Bokes> getBOkeById(@PathVariable("bokeId") Integer bokeId) {
        Bokes boke = bokesService.getById(bokeId);
        return ResultDtoManager.success(boke);
    }
}
