package co.borucki.MyCV.service;

import co.borucki.MyCV.dto.SkillDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SkillService {
    List<SkillDTO> findAll();

    SkillDTO create(SkillDTO skillDTO);
}
