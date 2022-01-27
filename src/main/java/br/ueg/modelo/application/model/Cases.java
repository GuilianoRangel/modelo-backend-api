package br.ueg.modelo.application.model;

import br.ueg.modelo.application.configuration.Constante;
import br.ueg.modelo.application.enums.StatusSimNao;
import br.ueg.modelo.application.enums.converter.StatusSimNaoConverter;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TBL_CASE", schema = Constante.DATABASE_OWNER)
@EqualsAndHashCode()
@SequenceGenerator(name = "TBL_S_CASE", sequenceName = "TBL_S_CASE", allocationSize = 1, schema = Constante.DATABASE_OWNER)
public @Data
class Cases {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TBL_S_CASE")
    @Column(name = "ID_CASE", nullable = false)
    private Long id;

    @Column(name = "NAME_CASE", length = 100, nullable = false)
    private String name;

    @Column(name = "GENDER_CASE", length = 100)
    private String gender;

    @Column(name = "AGE_CASE", length = 100)
    private Integer age;

    @Column(name = "ADDRESS_CASE", length = 100)
    private String address;

    @Column(name = "CITY_CASE", length = 100)
    private String city;

    @Column(name = "COUNTRY_CASE", length = 100)
    private String country;

    @Column(name = "STATUS_CASE", length = 100)
    private String status;

    @Column(name = "UPDATED_CASE", length = 100)
    private String updated;

}
