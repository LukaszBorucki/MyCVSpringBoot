package co.borucki.MyCV.service.impl;

import co.borucki.MyCV.dto.HobbiesDTO;
import co.borucki.MyCV.mapper.HobbiesMapper;
import co.borucki.MyCV.repository.HobbiesRepository;
import co.borucki.MyCV.service.HobbiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbiesServiceImpl implements HobbiesService {
    @Autowired
    private HobbiesRepository hobbesRepository = new HobbiesRepository();

    @Autowired
    private HobbiesMapper hobbesMapper;

    @Override
    public List<HobbiesDTO> findAll() {
        return hobbesMapper.toHobbiesDTOList(hobbesRepository.findAll());
    }

    @Override
    public HobbiesDTO create(HobbiesDTO hobbiesDTO) {
        return hobbesMapper.toHobbiesDTO(
                hobbesRepository.save(
                        hobbesMapper.toHobbies(hobbiesDTO)
                )
        );
    }
}
