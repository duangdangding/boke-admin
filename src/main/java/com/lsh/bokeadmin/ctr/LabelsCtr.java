package com.lsh.bokeadmin.ctr;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lsh.bokeadmin.entry.*;
import com.lsh.bokeadmin.service.BokesService;
import com.lsh.bokeadmin.service.LabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LabelsCtr {
    
    @Autowired
    private LabelsService labelsService;

    @RequestMapping("/getAllLabels")
    public BootStrapResult<Labels> getAllCategorys() {
        List<Labels> list = labelsService.list();
        return new BootStrapResult<Labels>(list,0L);
    }
    
    @RequestMapping("/addLabel")
    public ResultDto<String> addLabels(Labels labels) {
        if (labels.getLabelId() == 0) {
            QueryWrapper wrapper = new QueryWrapper();
            wrapper.eq("label_name",labels.getLabelName());
            Labels one = labelsService.getOne(wrapper);
            if (one != null) {
                return ResultDtoManager.success("此项已存在！");
            }
        }
        boolean b = labelsService.saveOrUpdate(labels);
        String res = "";
        if (b) {
            res = "操作成功~";
        } else {
            res = "操作失败~";
        }
        return ResultDtoManager.success(res);
    }

    @RequestMapping("/delLabel")
    public ResultDto<String> delLabels(Integer labelId) {
        boolean b = labelsService.removeById(labelId);
        String res = "";
        if (b) {
            res = "操作成功~";
        } else {
            res = "操作失败~";
        }
        return ResultDtoManager.success(res);
    }
}
