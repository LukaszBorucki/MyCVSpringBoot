package co.borucki.MyCV.controller;

import co.borucki.MyCV.dto.ExperienceCompanyDTO;
import co.borucki.MyCV.service.ExperienceCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/experience/company")
public class ExperienceCompanyController {
    @Autowired
    private ExperienceCompanyService service;

    @RequestMapping(value = "/all", method = GET)
    public List<ExperienceCompanyDTO> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/create", method = POST)
    public ExperienceCompanyDTO create(@RequestBody ExperienceCompanyDTO experienceCompanyDTO) {
        return service.create(experienceCompanyDTO);
    }
}
