package co.borucki.MyCV.mapper;

import co.borucki.MyCV.dto.ForeignLanguageDTO;
import co.borucki.MyCV.model.ForeignLanguage;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ForeignLanguageMapper {
    ForeignLanguageDTO toForeignLanguageDTO(ForeignLanguage foreignLanguage);

    List<ForeignLanguageDTO> toForeignLanguageDTOList(List<ForeignLanguage> foreignLanguageList);

    ForeignLanguage toForeignLanguage(ForeignLanguageDTO foreignLanguageDTO);

    List<ForeignLanguage> toForeignLanguageList(List<ForeignLanguageDTO> foreignLanguageDTOList);
}
