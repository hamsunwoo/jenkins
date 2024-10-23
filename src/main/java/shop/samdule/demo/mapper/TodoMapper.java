package shop.samdule.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import shop.samdule.demo.entity.TodoEntity;
import java.util.List;

@Mapper
public interface TodoMapper {
    List<TodoEntity> findAll();

    TodoEntity findById(Integer id);

    void insertTodo(String subject, String body, Boolean completed);

    void updateTodoById(TodoEntity todoEntity);

    void deleteTodoById(Integer id);
}
