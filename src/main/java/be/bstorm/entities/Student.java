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
@DiscriminatorValue("Etudiant")
public class Student extends Person{

    private String note;
}
