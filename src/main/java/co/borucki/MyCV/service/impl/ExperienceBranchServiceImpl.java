package co.borucki.MyCV.service.impl;

import co.borucki.MyCV.dto.ExperienceBranchDTO;
import co.borucki.MyCV.mapper.ExperienceBranchMapper;
import co.borucki.MyCV.repository.ExperienceBranchRepository;
import co.borucki.MyCV.service.ExperienceBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceBranchServiceImpl implements ExperienceBranchService {
    @Autowired
    private ExperienceBranchRepository experienceBranchRepository = new ExperienceBranchRepository();

    @Autowired
    private ExperienceBranchMapper experienceBranchMapper;

    @Override
    public List<ExperienceBranchDTO> findAll() {
        return experienceBranchMapper.toExperienceBranchDTOList(experienceBranchRepository.findAll());
    }

    @Override
    public ExperienceBranchDTO create(ExperienceBranchDTO experienceBranchDTO) {
        return experienceBranchMapper.toExperienceBranchDTO(
                experienceBranchRepository.save(
                        experienceBranchMapper.toExperienceBranch(experienceBranchDTO)
                )
        );
    }
}
