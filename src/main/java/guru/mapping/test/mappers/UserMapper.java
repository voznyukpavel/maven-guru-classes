package guru.mapping.test.mappers;
import guru.mapping.test.domain.User;
import guru.mapping.test.model.UserCommand;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserCommand userToUserCommand(User user);
    User userCommandToUser(UserCommand userCommand);
}
