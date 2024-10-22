package shop.samdule.demo.entity;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class TodoEntity {
    private Interger id;
    private String subject;
    private String body;
    private Boolean completed;
}
