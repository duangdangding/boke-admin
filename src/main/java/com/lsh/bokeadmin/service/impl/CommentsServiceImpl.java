package com.lsh.bokeadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lsh.bokeadmin.entry.Comments;
import com.lsh.bokeadmin.mapper.CommontsMapper;
import com.lsh.bokeadmin.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsServiceImpl extends ServiceImpl<CommontsMapper,Comments> implements CommentsService {
    
    @Autowired
    private CommontsMapper commentsMapper;
    
}
