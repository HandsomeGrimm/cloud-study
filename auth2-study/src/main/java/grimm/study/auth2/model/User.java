package grimm.study.auth2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String id;

    private String username;

    private String password;
}
