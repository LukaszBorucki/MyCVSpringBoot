package co.borucki.MyCV.controller;

import co.borucki.MyCV.dto.HobbiesDTO;
import co.borucki.MyCV.service.HobbiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hobby")
public class HobbiesController {
    @Autowired
    private HobbiesService service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HobbiesDTO> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public HobbiesDTO create(@RequestBody HobbiesDTO hobbiesDTO) {
        return service.create(hobbiesDTO);
    }
}
