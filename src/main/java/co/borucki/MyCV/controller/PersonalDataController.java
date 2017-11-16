package co.borucki.MyCV.controller;

import co.borucki.MyCV.dto.PersonalDataDTO;
import co.borucki.MyCV.service.PersonalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/personalData")
public class PersonalDataController {
    @Autowired
    private PersonalDataService service;

    @RequestMapping(value = "/all", method = GET)
    public List<PersonalDataDTO> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/create", method = POST)
    public PersonalDataDTO create(@RequestBody PersonalDataDTO personalDataDTO) {
        return service.create(personalDataDTO);
    }
}
