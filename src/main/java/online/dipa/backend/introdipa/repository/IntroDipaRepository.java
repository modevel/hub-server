package online.dipa.backend.introdipa.repository;

import online.dipa.backend.introdipa.domain.IntroDipa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class IntroDipaRepository {
    private List<IntroDipa> introDipas = new ArrayList<>();

    public IntroDipa add(IntroDipa introDipa) {
        introDipa.setId((long) (introDipas.size() + 1));
        introDipas.add(introDipa);
        return introDipa;
    }

    public IntroDipa findById(Long id) {
        Optional<IntroDipa> introDipa = introDipas.stream().filter(a -> a.getId().equals(id)).findFirst();
        if (introDipa.isPresent())
            return introDipa.get();
        else
            return null;
    }

    public List<IntroDipa> findAll() {
        return introDipas;
    }

    public List<IntroDipa> findByOrganizationName(String organizationName) {
        return introDipas.stream().filter(a -> a.getOrganizationName().equals(organizationName)).collect(Collectors.toList());
    }

    public List<IntroDipa> findByProjectName(String projectName) {
        return introDipas.stream().filter(a -> a.getProjectName().equals(projectName)).collect(Collectors.toList());
    }
}
