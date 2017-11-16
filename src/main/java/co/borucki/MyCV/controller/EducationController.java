package co.borucki.MyCV.controller;

import co.borucki.MyCV.dto.EducationDTO;
import co.borucki.MyCV.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/education")
public class EducationController {
    @Autowired
    private EducationService service;

    @RequestMapping(value = "/all", method = GET)
    public List<EducationDTO> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/create", method = POST)
    public EducationDTO create(@RequestBody EducationDTO educationDTO) {
        return service.create(educationDTO);
    }
}
