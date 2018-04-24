package com.test.biz.Impl;

import com.test.biz.ResumeService;
import com.test.dao.ResumeMapper;
import com.test.model.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeMapper resumeMapper;
    @Override
    public void saveResume(Resume resume) {
        resumeMapper.saveResume(resume);
    }

    @Override
    public List<Resume> getResume() {
        return resumeMapper.getResume();
    }

    @Override
    public List<Resume> getResumeById(int id) {
        return resumeMapper.getResumeById(id);
    }
}
