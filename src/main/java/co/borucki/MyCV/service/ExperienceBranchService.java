package co.borucki.MyCV.service;

import co.borucki.MyCV.dto.ExperienceBranchDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExperienceBranchService {
    List<ExperienceBranchDTO> findAll();

    ExperienceBranchDTO create(ExperienceBranchDTO experienceBranchDTO);
}
