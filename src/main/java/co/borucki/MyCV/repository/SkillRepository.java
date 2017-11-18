package co.borucki.MyCV.repository;

import co.borucki.MyCV.model.Skill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends CrudRepository<Skill, Long> {
    List<Skill> findAll();

    Skill save(Skill skill);

}
