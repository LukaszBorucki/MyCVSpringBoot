package co.borucki.MyCV.mapper;

import co.borucki.MyCV.dto.ExperiencePeriodDTO;
import co.borucki.MyCV.model.ExperiencePeriod;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExperiencePeriodMapper {
    ExperiencePeriodDTO toExperiencePeriodDTO(ExperiencePeriod experiencePeriod);

    List<ExperiencePeriodDTO> toExperiencePeriodDTOList(List<ExperiencePeriod> experiencePeriodList);

    ExperiencePeriod toExperiencePeriod(ExperiencePeriodDTO experiencePeriodDTO);

    List<ExperiencePeriod> toExperiencePeriodList(List<ExperiencePeriodDTO> experiencePeriodDTOList);
}
