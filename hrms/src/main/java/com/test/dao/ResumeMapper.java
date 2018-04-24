package com.test.dao;

import com.test.model.Resume;

import java.util.List;

public interface ResumeMapper {
    void saveResume(Resume resume);
    List<Resume> getResume();
}
