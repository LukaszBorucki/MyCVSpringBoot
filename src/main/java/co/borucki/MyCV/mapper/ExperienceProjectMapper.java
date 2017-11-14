package co.borucki.MyCV.mapper;

import co.borucki.MyCV.dto.ExperienceProjectDTO;
import co.borucki.MyCV.model.ExperienceProject;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExperienceProjectMapper {

    ExperienceProjectDTO toExperienceProjectDTO(ExperienceProject experienceProject);

    List<ExperienceProjectDTO> toExperienceProjectDTOList(List<ExperienceProject> experienceProjectList);

    ExperienceProject toExperienceProject(ExperienceProjectDTO experienceProjectDTO);

    List<ExperienceProject> toExperienceProjectList(List<ExperienceProjectDTO> experienceProjectDTOList);
}
