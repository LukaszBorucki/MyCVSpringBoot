package co.borucki.MyCV.repository;

import co.borucki.MyCV.BasicData;
import co.borucki.MyCV.model.Skill;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SkillRepository {
    private List<Skill> skillList = new ArrayList<>();

    public SkillRepository() {
        skillList.addAll(BasicData.BasicSkillData());
    }

    public List<Skill> findAll() {
        return skillList;
    }

    public Skill save(Skill skill) {
        skillList.add(skill);
        return skill;
    }
}
