package grimm.study.auth2.config;

import grimm.study.auth2.model.User;
import grimm.study.auth2.model.UserDetail;
import grimm.study.auth2.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component("signUserDetailService")
public class UserDetailServiceConfig implements UserDetailsService {

        @Autowired
        private IUserService userService;

        /**
         * 启动刷新token授权类型，会判断用户是否还是存活的
         */
        @Override
        public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
            User currentUser = userService.getByName(s);
            if ( currentUser == null ) {
                throw new UsernameNotFoundException("用户没用找到");
            }

            return new UserDetail(currentUser);
        }

}
