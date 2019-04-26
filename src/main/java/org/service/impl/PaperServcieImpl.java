package org.service.impl;

import org.dao.PaperDAO;
import org.pojo.Paper;
import org.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PaperServcieImpl implements PaperService {
    @Autowired
    PaperDAO paperDao;
    @Override
    public int addPaper(Paper paper) {
        return paperDao.addPaper(paper);
    }

    @Override
    public int deletePaperById(long id) {
        return paperDao.deletePaperById(id);
    }

    @Override
    public int updatePaper(Paper paper) {
        return paperDao.updatePaper(paper);
    }

    @Override
    public Paper queryById(long id) {
        return paperDao.queryById(id);
    }

    @Override
    public List<Paper> queryAllPaper() {
        return paperDao.queryAllPaper();
    }
}
