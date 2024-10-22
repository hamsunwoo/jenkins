package shop.samdule.demo.entity;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
@ToString
public class TodoEntity {
    private Interger id;
    private String subject;
    private String body;
    private Boolean completed;
}
