package com.clouduniversity.repositories;

import com.clouduniversity.models.FileUpload;
import org.springframework.data.repository.CrudRepository;

public interface FileUploadRepository extends CrudRepository<FileUpload,Long> {
}
