package grimm.study.auth2.service;

import grimm.study.auth2.model.User;

public interface IUserService {

    User getByName(String username);
}
