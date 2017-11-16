package co.borucki.MyCV.mapper;

import co.borucki.MyCV.dto.MailUserAuthorizationDTO;
import co.borucki.MyCV.model.MailUserAuthorization;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MailUserAuthorizationMapper {
    MailUserAuthorizationDTO toMailUserAuthorizationDTO(MailUserAuthorization mailUserAuthorization);

    List<MailUserAuthorizationDTO> toMailUserAuthorizationDTOList(List<MailUserAuthorization> mailUserAuthorizationList);

    MailUserAuthorization toMailUserAuthorization(MailUserAuthorizationDTO mailUserAuthorizationDTO);

    List<MailUserAuthorization> toMailUserAuthorizationList(List<MailUserAuthorizationDTO> mailUserAuthorizationDTOList);
}
