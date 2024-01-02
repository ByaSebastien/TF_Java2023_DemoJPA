package be.bstorm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Personne")
@DiscriminatorColumn(name = "personType")
public class Person {

    @Id
    private Long id;

    private String name;
}
