package online.dipa.backend.introdipa.controller;

import online.dipa.backend.introdipa.domain.IntroDipa;
import online.dipa.backend.introdipa.repository.IntroDipaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IntroDipaController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IntroDipaController.class);

    @Autowired
    IntroDipaRepository repository;

    @PostMapping("/")
    public IntroDipa add(@RequestBody IntroDipa introDipa) {
        LOGGER.info("IntroDipa add: {}", introDipa);
        return repository.add(introDipa);
    }

    @GetMapping("/{id}")
    public IntroDipa findById(@PathVariable("id") Long id) {
        LOGGER.info("IntroDipa find: id={}", id);
        return repository.findById(id);
    }

    @GetMapping("/")
    public List<IntroDipa> findAll() {
        LOGGER.info("IntroDipa find");
        return repository.findAll();
    }

    @GetMapping("/organization/{organizationName}")
    public List<IntroDipa> findByOrganizationName(@PathVariable("organizationName") String organizationName) {
        LOGGER.info("IntroDipa find: organizationName={}", organizationName);
        return repository.findByOrganizationName(organizationName);
    }

}
