package com.lsh.bokeadmin.ctr;

import com.lsh.bokeadmin.entry.ResultDto;
import com.lsh.bokeadmin.entry.ResultDtoManager;
import com.lsh.bokeadmin.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 阿里云OSS测试接口
 *
 * @author jason
 */
@RestController
@RequestMapping("/oss")
public class UploadController {

    @Autowired
    private CommonService commonService;

    /**
     * 上传文件至阿里云 oss
     *
     * @param files
     * @param uploadKey
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/upload", method = {RequestMethod.POST}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResultDto<List<Map>> uploadOSS(@RequestParam(value = "files") List<MultipartFile> files, String uploadKey) throws Exception {
        List<Map> maps = new ArrayList<>();
        for (int i = 0; i < files.size(); i++) {
            Map apiResult = commonService.uploadOSS(files.get(i), null);
            maps.add(apiResult);
        }
        return ResultDtoManager.success(maps);
    }

}