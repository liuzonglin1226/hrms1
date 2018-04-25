package com.test.dao;

import com.test.model.Resume;

import java.util.List;

public interface ResumeMapper {
    void saveResume(Resume resume);
    void updateResume(Resume resume);
    List<Resume> getResume();
    List<Resume> getResumeById(int id);
}
