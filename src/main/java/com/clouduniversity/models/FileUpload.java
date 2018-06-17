package com.clouduniversity.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="file_upload")
@Getter
@Setter
public class FileUpload {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long file_id;

    @Lob
    @Column(name = "upload_file")
    private byte[] upload_file;






}
