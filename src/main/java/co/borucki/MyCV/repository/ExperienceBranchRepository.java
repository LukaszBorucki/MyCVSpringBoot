package co.borucki.MyCV.repository;

import co.borucki.MyCV.model.ExperienceBranch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExperienceBranchRepository extends CrudRepository<ExperienceBranch, Long> {
    List<ExperienceBranch> findAll();

    ExperienceBranch save(ExperienceBranch experienceBranch);

}
