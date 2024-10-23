package shop.samdule.demo.entity;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

import org.checkerframework.checker.signature.qual.Identifier;

import jakarta.persistence.*;

@Entity
@Table(name = "todo_jpa")
@Setter
@Getter
@ToString
public class TodoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String subject;
    @Column(nullable = false)
    private String body;
    private Boolean completed;
}
