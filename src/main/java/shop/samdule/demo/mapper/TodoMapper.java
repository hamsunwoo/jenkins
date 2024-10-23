package shop.samdule.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import shop.samdule.demo.entity.TodoEntity;
import java.util.List;

@Mapper
public interface TodoMapper {
    List<TodoEntity> findAll();

    TodoEntity findById(Integer id);

    void deleteById(Integer id);

    void updateById(Integer id, String subject, String body, Boolean completed);

    void insert(String subject, String body, Boolean completed);
}
