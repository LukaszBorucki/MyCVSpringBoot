package co.borucki.MyCV.mapper;

import co.borucki.MyCV.dto.AdditionalDTO;
import co.borucki.MyCV.model.Additional;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdditionalMapper {
    AdditionalDTO toAdditionalDTO(Additional additional);

    Additional toAdditional(AdditionalDTO additionalDTO);

    List<AdditionalDTO> toAdditionalDTOList(List<Additional> additionalList);

    List<Additional> toAdditionalList(List<AdditionalDTO> additionalDTOList);
}
