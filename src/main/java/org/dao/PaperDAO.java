package org.dao;

import org.pojo.Paper;

import java.util.List;

public interface PaperDAO {
    int addPaper(Paper papper);
    int deletePaperById(long id);
    int updatePaper(Paper paper);
    Paper queryById(long id);
    List<Paper> queryAllPaper();
}
