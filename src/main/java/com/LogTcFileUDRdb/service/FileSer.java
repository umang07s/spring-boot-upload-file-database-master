package com.LogTcFileUDRdb.service;

import java.io.IOException;
import java.util.stream.Stream;

import com.LogTcFileUDRdb.model.Files;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.LogTcFileUDRdb.repository.FileRepo;

@Service
public class FileSer {

  @Autowired
  private FileRepo repo;

  public Files add(MultipartFile file) throws IOException {
    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
    Files Files = new Files(fileName, file.getContentType(), file.getBytes());

    return repo.save(Files);
  }

  public Files getFile(String id) {
    return repo.findById(id).get();
  }
  
  public Stream<Files> getAllFiles() {
    return repo.findAll().stream();
  }
}
