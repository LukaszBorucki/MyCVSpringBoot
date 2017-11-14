package co.borucki.MyCV.mapper;

import co.borucki.MyCV.dto.SkillDTO;
import co.borucki.MyCV.model.Skill;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SkillMapper {
    SkillDTO toSkillDTO(Skill skill);

    List<SkillDTO> toSkillDTOList(List<Skill> skillList);

    Skill toSkill(SkillDTO skillDTO);

    List<Skill> toSkillList(List<SkillDTO> skillDTOList);
}
