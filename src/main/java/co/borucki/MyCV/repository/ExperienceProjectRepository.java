package co.borucki.MyCV.repository;

import co.borucki.MyCV.BasicData;
import co.borucki.MyCV.model.ExperienceProject;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ExperienceProjectRepository {
    private List<ExperienceProject> experienceProjectList = new ArrayList<>();

    public ExperienceProjectRepository() {
        experienceProjectList.addAll(BasicData.BasicExperienceProjectData());
    }

    public List<ExperienceProject> findAll() {
        return experienceProjectList;
    }

    public ExperienceProject save(ExperienceProject experienceProject) {
        experienceProjectList.add(experienceProject);
        return experienceProject;
    }
}
