package com.lsh.bokeadmin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lsh.bokeadmin.entry.Bokes;
import com.lsh.bokeadmin.entry.Categorys;

public interface CategorysMapper extends BaseMapper<Categorys> {
    long addCate(Categorys categorys);
}
