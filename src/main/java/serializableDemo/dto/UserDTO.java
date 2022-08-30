package serializableDemo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Builder
@Getter
@Setter
public class UserDTO implements Serializable {
    private  static  final  long serialVersionUID = 2;
    //年龄
    private int age;
    //名字
    private String name ;

    private String gender;
}
