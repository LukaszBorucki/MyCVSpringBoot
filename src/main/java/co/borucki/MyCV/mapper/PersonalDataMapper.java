package co.borucki.MyCV.mapper;

import co.borucki.MyCV.dto.PersonalDataDTO;
import co.borucki.MyCV.model.PersonalData;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonalDataMapper {
    PersonalDataDTO toPersonalDataDTO(PersonalData personalData);

    List<PersonalDataDTO> toPersonalDataDTOList(List<PersonalData> personalDataList);

    PersonalData toPersonalData(PersonalDataDTO personalDataDTO);

    List<PersonalData> toPersonalDataList(List<PersonalDataDTO> personalDataDTOList);
}
