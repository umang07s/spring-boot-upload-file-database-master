package com.LogTcFileUDRdb.repository;

import com.LogTcFileUDRdb.model.Files;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepo extends JpaRepository<Files, String> {

}
