package co.borucki.MyCV.repository;

import co.borucki.MyCV.model.ExperienceProject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExperienceProjectRepository extends CrudRepository<ExperienceProject, Long> {
    List<ExperienceProject> findAll();

    ExperienceProject save(ExperienceProject experienceProject);
}
