package grimm.study.auth2.service.impl;

import grimm.study.auth2.model.User;
import grimm.study.auth2.service.IUserService;

public class IUserServiceImpl implements IUserService {
    @Override
    public User getByName(String username) {
        return new User("456","grimm","labilabi600");
    }
}
