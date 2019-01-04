package com.TCard.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

public interface FileUploadController {
	
//	// 多個檔案上傳的接口
//    @PostMapping("/api/upload/multi")
//    @ResponseBody
//    public ResponseEntity<?> uploadFileMulti(@RequestParam("files") MultipartFile[] uploadfiles) {
//
//
//        // 取得檔案名稱
//        String uploadedFileName = Arrays.stream(uploadfiles).map(x -> x.getOriginalFilename())
//                .filter(x -> !StringUtils.isEmpty(x)).collect(Collectors.joining(" , "));
//
//        if (StringUtils.isEmpty(uploadedFileName)) {
//            return new ResponseEntity("請選擇檔案!", HttpStatus.OK);
//        }
//
//        try {
//
//            saveUploadedFiles(Arrays.asList(uploadfiles));
//
//        } catch (IOException e) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//        return new ResponseEntity("成功上傳 - "
//                + uploadedFileName, HttpStatus.OK);
//
//    }
}
