package com.test.biz;

import com.test.model.Resume;

import java.util.List;

public interface ResumeService {
    void saveResume(Resume resume);
    List<Resume> getResume();
    List<Resume> getResumeById(int id);
}
