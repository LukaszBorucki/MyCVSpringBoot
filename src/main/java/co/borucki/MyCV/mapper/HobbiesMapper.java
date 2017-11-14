package co.borucki.MyCV.mapper;

import co.borucki.MyCV.dto.HobbiesDTO;
import co.borucki.MyCV.model.Hobbies;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HobbiesMapper {
    HobbiesDTO toHobbiesDTO(Hobbies hobbies);

    List<HobbiesDTO> toHobbiesDTOList(List<Hobbies> hobbiesList);

    Hobbies toHobbies(HobbiesDTO hobbiesDTO);

    List<Hobbies> toHobbiesList(List<HobbiesDTO> hobbiesDTOList);
}
