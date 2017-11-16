package co.borucki.MyCV.mapper;

import co.borucki.MyCV.dto.ExperienceBranchDTO;
import co.borucki.MyCV.model.ExperienceBranch;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExperienceBranchMapper {
    ExperienceBranchDTO toExperienceBranchDTO(ExperienceBranch experienceBranch);

    List<ExperienceBranchDTO> toExperienceBranchDTOList(List<ExperienceBranch> experienceBranchList);

    ExperienceBranch toExperienceBranch(ExperienceBranchDTO experienceBranchDTO);

    List<ExperienceBranch> toExperienceBranchList(List<ExperienceBranchDTO> experienceBranchDTOList);
}
