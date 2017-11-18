package co.borucki.MyCV.service.impl;

import co.borucki.MyCV.dto.SkillDTO;
import co.borucki.MyCV.mapper.SkillMapper;
import co.borucki.MyCV.repository.SkillRepository;
import co.borucki.MyCV.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {
    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private SkillMapper skillMapper;

    @Override
    public List<SkillDTO> findAll() {
        return skillMapper.toSkillDTOList(skillRepository.findAll());
    }

    @Override
    public SkillDTO create(SkillDTO skillDTO) {
        return skillMapper.toSkillDTO(
                skillRepository.save(
                        skillMapper.toSkill(skillDTO)
                )
        );
    }
}
