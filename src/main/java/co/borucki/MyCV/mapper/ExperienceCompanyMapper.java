package co.borucki.MyCV.mapper;

import co.borucki.MyCV.dto.ExperienceCompanyDTO;
import co.borucki.MyCV.model.ExperienceCompany;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExperienceCompanyMapper {
    ExperienceCompanyDTO toExperienceCompanyDTO(ExperienceCompany experienceCompany);

    List<ExperienceCompanyDTO> toExperienceCompanyDTOList(List<ExperienceCompany> experienceCompanyList);

    ExperienceCompany toExperienceCompany(ExperienceCompanyDTO experienceCompanyDTO);

    List<ExperienceCompany> toExperienceCompanyList(List<ExperienceCompanyDTO> experienceCompanyDTOList);
}
