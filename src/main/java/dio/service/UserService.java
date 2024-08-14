package dio.service;

import dio.dimain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
