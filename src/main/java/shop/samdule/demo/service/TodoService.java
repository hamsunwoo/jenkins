package shop.samdule.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.samdule.demo.entity.TodoEntity;
import shop.samdule.demo.mapper.TodoMapper;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoMapper todoMapper;

    public List<TodoEntity> getTodos() {
        System.out.println("[service] findAll");
        List<TodoEntity> todos = todoMapper.findAll();
        System.out.println("[todos]:" + todos.size());
        return todos;
    }

    public TodoEntity findById(Integer id) {
        return todoMapper.findById(id);
    }

    public void insert(TodoEntity todoEntity) {
        todoMapper.insert(todoEntity.getSubject(), todoEntity.getBody(), todoEntity.getCompleted());
    }

    public void updateById(TodoEntity todoEntity) {
        todoMapper.updateById(todoEntity.getId(), todoEntity.getSubject(), todoEntity.getBody(),
                todoEntity.getCompleted());
    }

    public void deleteById(Integer id) {
        todoMapper.deleteById(id);
    }

}
