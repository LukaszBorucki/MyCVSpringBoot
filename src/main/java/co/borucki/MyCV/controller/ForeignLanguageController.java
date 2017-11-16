package co.borucki.MyCV.controller;

import co.borucki.MyCV.dto.ForeignLanguageDTO;
import co.borucki.MyCV.service.ForeignLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/language")
public class ForeignLanguageController {
    @Autowired
    private ForeignLanguageService service;

    @RequestMapping(value = "/all", method = GET)
    public List<ForeignLanguageDTO> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/create", method = POST)
    public ForeignLanguageDTO create(@RequestBody ForeignLanguageDTO foreignLanguageDTO) {
        return service.create(foreignLanguageDTO);
    }
}
