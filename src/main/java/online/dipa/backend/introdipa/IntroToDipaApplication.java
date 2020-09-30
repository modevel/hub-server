package online.dipa.backend.introdipa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import online.dipa.backend.introdipa.domain.IntroDipa;
import online.dipa.backend.introdipa.controller.IntroDipaController;
import online.dipa.backend.introdipa.repository.IntroDipaRepository;

@SpringBootApplication
@EnableSwagger2
@OpenAPIDefinition(info =
@Info(title = "IntroDipa API", version = "1.0", description = "Documentation IntroDipa API v1.0")
)
public class IntroToDipaApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntroToDipaApplication.class, args);
    }

    @Bean
    public Docket swaggerPersonApi10() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("online.dipa.backend.introdipa.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(new ApiInfoBuilder().version("1.0").title("IntroDipa API").description("Documentation IntroDipa API v1.0").build());
    }

    @Bean
    IntroDipaRepository repository() {
        IntroDipaRepository repository = new IntroDipaRepository();
        repository.add(new IntroDipa("ITZBund", "DiPA", "Software", "cooles Projectmanagement", "ein wirkliches coooles Tool für Projektmanagement"));
        repository.add(new IntroDipa("Zoll", "ZEUS", "Software", "Taricnummernzuordnung", "ja, das ist etwas mit Cammunda"));
        repository.add(new IntroDipa("BAV", "Dienstpostenbewertung", "Software", "Dienstposten eingruppieren", "Dienstposten sollen zentral verwaltet werden und eingruppiert"));
        repository.add(new IntroDipa("BVA", "INSI", "Infrastruktur", "Cloud für Innere Sicherheit", "Aufbau einer Cloud mit Georedundanz in den Rechenzentren des ITZBund"));
        return repository;
    }
}
