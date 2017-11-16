package co.borucki.MyCV.service;

import co.borucki.MyCV.dto.HobbiesDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HobbiesService {
    List<HobbiesDTO> findAll();

    HobbiesDTO create(HobbiesDTO hobbiesDTO);
}
