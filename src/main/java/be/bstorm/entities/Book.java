package be.bstorm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne(
            cascade = {CascadeType.PERSIST,CascadeType.MERGE},
            fetch = FetchType.EAGER)
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }
}
