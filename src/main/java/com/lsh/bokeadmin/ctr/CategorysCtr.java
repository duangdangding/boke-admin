package com.lsh.bokeadmin.ctr;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lsh.bokeadmin.entry.BootStrapResult;
import com.lsh.bokeadmin.entry.Categorys;
import com.lsh.bokeadmin.entry.ResultDto;
import com.lsh.bokeadmin.entry.ResultDtoManager;
import com.lsh.bokeadmin.service.BokesService;
import com.lsh.bokeadmin.service.CategorysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategorysCtr {
    
    @Autowired
    private CategorysService categorysService;
    
    @RequestMapping("/getAllCates")
    public BootStrapResult<Categorys> getAllCategorys() {
        List<Categorys> list = categorysService.list();
        return new BootStrapResult<>(list,0L);
    }
    
    @RequestMapping("/addCate")
    public ResultDto<String> addCategory(Categorys categorys) {
        if (categorys.getCateId() == 0 ) {
            QueryWrapper wrapper = new QueryWrapper();
            wrapper.eq("cate_name",categorys.getCateName());
            Categorys one = categorysService.getOne(wrapper);
            if (one != null) {
                return ResultDtoManager.success("此项已存在！");
            }
        }
        boolean b = categorysService.saveOrUpdate(categorys);
        String res = "";
        if (b) {
            res = "操作成功~";
        } else {
            res = "操作失败~";
        } 
        return ResultDtoManager.success(res);
    }
    
    @RequestMapping("/delCate")
    public ResultDto<String> delCategory(Integer cateId) {
        boolean b = categorysService.removeById(cateId);
        String res = "";
        if (b) {
            res = "操作成功~";
        } else {
            res = "操作失败~";
        } 
        return ResultDtoManager.success(res);
    }
}
