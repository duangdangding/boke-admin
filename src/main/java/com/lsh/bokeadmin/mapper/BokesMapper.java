package com.lsh.bokeadmin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lsh.bokeadmin.entry.BokeListEntry;
import com.lsh.bokeadmin.entry.Bokes;

public interface BokesMapper extends BaseMapper<Bokes> {
    IPage<BokeListEntry> getBokes(IPage<BokeListEntry> ipage, String title, Integer cateId);
}
