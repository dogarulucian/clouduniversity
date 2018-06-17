package com.clouduniversity.repositories;

import com.clouduniversity.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.multipart.MultipartFile;

public interface StudentRepository extends JpaRepository<Student,Long> {

//    @Override
//    default <S extends Student> S save(S s) {
//        return null;
//    }

//    void save(MultipartFile file);
}
