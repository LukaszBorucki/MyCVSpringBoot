package co.borucki.MyCV.repository;

import co.borucki.MyCV.BasicData;
import co.borucki.MyCV.model.ExperienceBranch;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ExperienceBranchRepository {
    private List<ExperienceBranch> experienceBranchList = new ArrayList<>();

    public ExperienceBranchRepository() {
        experienceBranchList.addAll(BasicData.BasicExperienceBranchData());
    }

    public List<ExperienceBranch> findAll() {
        return experienceBranchList;
    }

    public ExperienceBranch save(ExperienceBranch experienceBranch) {
        experienceBranchList.add(experienceBranch);
        return experienceBranch;
    }

}
