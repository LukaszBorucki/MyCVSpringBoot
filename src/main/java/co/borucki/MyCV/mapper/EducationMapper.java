package co.borucki.MyCV.mapper;

import co.borucki.MyCV.dto.EducationDTO;
import co.borucki.MyCV.model.Education;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EducationMapper {
    EducationDTO toEducationDTO(Education education);

    List<EducationDTO> toEducationDTOList(List<Education> educationList);

    Education toEducation(EducationDTO educationDTO);

    List<Education> toEducationList(List<EducationDTO> educationDTOList);

}
