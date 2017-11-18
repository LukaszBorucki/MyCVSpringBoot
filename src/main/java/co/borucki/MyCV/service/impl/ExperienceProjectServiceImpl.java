package co.borucki.MyCV.service.impl;

import co.borucki.MyCV.dto.ExperienceProjectDTO;
import co.borucki.MyCV.mapper.ExperienceProjectMapper;
import co.borucki.MyCV.repository.ExperienceProjectRepository;
import co.borucki.MyCV.service.ExperienceProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceProjectServiceImpl implements ExperienceProjectService {
    @Autowired
    private ExperienceProjectRepository experienceProjectRepository;

    @Autowired
    private ExperienceProjectMapper experienceProjectMapper;

    @Override
    public List<ExperienceProjectDTO> findAll() {
        return experienceProjectMapper.toExperienceProjectDTOList(experienceProjectRepository.findAll());
    }

    @Override
    public ExperienceProjectDTO create(ExperienceProjectDTO experienceProjectDTO) {
        return experienceProjectMapper.toExperienceProjectDTO(
                experienceProjectRepository.save(
                        experienceProjectMapper.toExperienceProject(experienceProjectDTO)
                )
        );
    }
}
