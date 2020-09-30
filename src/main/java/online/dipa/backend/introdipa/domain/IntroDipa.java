package online.dipa.backend.introdipa.domain;

public class IntroDipa {
    private Long id;                        // Id
    private String organizationName;        // Behoerde
    private String projectName;             // Projektname
    private String projectTyp;              // Typ: Software, Infrastruktur, Beschaffung
    private String projectDescriptionShort; // kurze Projektbeschreibung
    private String projectDescriptionLong;  // ausführliche Projektbeschreibung

    public IntroDipa() {
    }

    public IntroDipa(String organizationName, String projectName, String projectTyp) {
        this.organizationName = organizationName;
        this.projectName = projectName;
        this.projectTyp = projectTyp;
    }

    public IntroDipa(String organizationName, String projectName, String projectTyp, String projectDescriptionShort, String projectDescriptionLong) {
        this.organizationName = organizationName;
        this.projectName = projectName;
        this.projectTyp = projectTyp;
        this.projectDescriptionShort = projectDescriptionShort;
        this.projectDescriptionLong = projectDescriptionLong;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectTyp() {
        return projectTyp;
    }

    public void setProjectTyp(String projectTyp) {
        this.projectTyp = projectTyp;
    }

    public String getProjectDescriptionShort() {
        return projectDescriptionShort;
    }

    public void setProjectDescriptionShort(String projectDescriptionShort) {
        this.projectDescriptionShort = projectDescriptionShort;
    }

    public String getProjectDescriptionLong() {
        return projectDescriptionLong;
    }

    public void setProjectDescriptionLong(String projectDescriptionLong) {
        this.projectDescriptionLong = projectDescriptionLong;
    }

    @Override
    public String toString() {
        return "IntroDipa{" +
                "id=" + id +
                ", organizationName='" + organizationName + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectTyp='" + projectTyp + '\'' +
                ", projectDescriptionShort='" + projectDescriptionShort + '\'' +
                ", projectDescriptionLong='" + projectDescriptionLong + '\'' +
                '}';
    }
}
