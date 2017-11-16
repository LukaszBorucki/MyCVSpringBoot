package co.borucki.MyCV.controller;

import co.borucki.MyCV.dto.ExperienceProjectDTO;
import co.borucki.MyCV.service.ExperienceProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/company/project")
public class ExperienceProjectController {
    @Autowired
    private ExperienceProjectService service;

    @RequestMapping(value = "/all", method = GET)
    public List<ExperienceProjectDTO> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/create", method = POST)
    public ExperienceProjectDTO create(@RequestBody ExperienceProjectDTO experienceProjectDTO) {
        return service.create(experienceProjectDTO);
    }
}
