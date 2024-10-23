package shop.samdule.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import shop.samdule.demo.entity.TodoEntity;
import java.util.List;

@Mapper
public interface TodoMapper {
    List<TodoEntity> findAll();
    List<TodoEntity> findById(Integer id);

}
